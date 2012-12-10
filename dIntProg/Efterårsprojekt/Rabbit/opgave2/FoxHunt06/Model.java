import java.util.*;
import java.awt.*;
import javax.swing.*;

/**
 * Creates and maintains a "field" for the hound and fox, and sets up
 * a number of methods to be used to move animals around. The brains
 * are not given direct access to these methods, as this would allow
 * them to cheat. Instead, they are given limited access to these
 * methods through a World object that represents only the things they
 * are allowed to know.
 * 
 * @author David Matuszek
 * @author Martin Geisler
 * @author Mikkel Kroeigaard
 * @author Casper Torndahl
 * @version Januar 29, 2006
 */
public class Model {
      private static Bush BUSH_PIECE = new Bush();
      private int numberofhounds;
      private int numberofbushes;
      private ArrayList<Hound> hounds;
      private Iterator<Hound> houndit;
   
      // define instance variables
      private Grid<Piece> field;// Playboard
      private int numberOfRows;
      private int numberOfColumns;
      private Fox fox;

      private static Random randomNumberGenerator = new Random();
      private static Random seedGenerator = new Random();
      private long oldRandomSeed = 30;
      private boolean isUnderConstruction;
      /** True if fox's turn, false if hounds turn */
      private boolean isFoxsTurn;    
      /** Flag used to end the game when the hounds wins */
      private boolean foxIsAlive;
      /** Flag to tell when the game ends */
      private boolean gameIsOver;
      /** The number of turns taken so far in the game */
      private int stepsTaken;
      /** The number of rows in the field */
      private final int NUMBER_OF_ROWS;
      /** The number of columns in the field */
      private final int NUMBER_OF_COLUMNS;

      /**
       * Constructs a model that uses a field of the given size.
       *
       * @param width The width of the field to be used by the model.
       * @param height The height of the field to be used by the model.
       */
      public Model(int width, int height){
	    field = new Grid<Piece>(width, height);

	    NUMBER_OF_ROWS = numberOfRows = width;
	    NUMBER_OF_COLUMNS = numberOfColumns = height;

	    numberofhounds = 1;
	    numberofbushes = 20;

	    reset();
      }


      /**
       * Constructs a model that uses a field of the given size.
       *
       * @param width The width of the field to be used by the model.
       * @param height The height of the field to be used by the model.
       * @param numofhounds The number of hounds (always 0<) to hunt the fox.
       * @param numofbush The number of bushes on the field (interpreted as %).
       */
      public Model(int width, int height, int numofhounds, int numofbush) {
	    field = new Grid<Piece>(width, height);

	    NUMBER_OF_ROWS = numberOfRows = width;
	    NUMBER_OF_COLUMNS = numberOfColumns = height;

	    numberofhounds = ((0 < numofhounds)? numofhounds : 1);
	    numberofbushes = (int)(((double)width) * ((double)height) * ((double)numofbush/100.0));

	    reset();
      }

      /**
       * Returns the field.
       * @return the field
       */
      public Grid<Piece> getField() {
	    return field;
      }
    
      /** 
       * Sets replay mode and rewinds to turn 0. The game that starts
       * there is exactly the same as before.
       */
      public void replay() {
	    populate(true);
      }

      /**
       * Reset the game.
       */
      public void reset() {
	    populate(false);
      }

      /**
       * Puts some hounds, a fox, and some bushes in the field.
       */
      private void populate(boolean replay) {
	    Hound h;
	    int distance, numrows, numcols,
		  houndrow, houndcolumn, 
		  foxrow, foxcolumn, 
		  bushrow, bushcolumn, 
		  i, j;

	    // protect against calls during creation of game
	    isUnderConstruction = true;

	    gameIsOver = false;
	    foxIsAlive = true;
	    isFoxsTurn = true;
	    stepsTaken = 0;

	    // if this is not a replay, we use a new random seed
	    if(!replay)
		  oldRandomSeed = seedGenerator.nextLong();
	    randomNumberGenerator.setSeed(oldRandomSeed);
        
	    // create some abbreviations, just to save some typing
	    numrows = numberOfRows;
	    numcols = numberOfColumns;
        
	    // remove any previous contents of field
	    for (i = 0; i < numrows; i++)
		  for (j = 0; j < numcols; j++)
			field.set(i,j,null);
		          
	    // put the fox in a random location
	    fox = new Fox(this);
	    fox.setBrain(new FoxBrain());
	    fox.setRowColumn(random(0, numrows - 1), 
			     random(0, numcols - 1)); 
	    field.set(fox.getRow(), fox.getColumn(), fox);

	    // put hounds in a random location, not too close to the fox
	    hounds = new ArrayList<Hound>();
	    for(i = 0; i < numberofhounds; i++){
		  h = new Hound(this);
		  h.setBrain(new HoundBrain());

		  do {
			houndrow = random(0, numrows - 1);
			houndcolumn = random(0, numcols - 1);
			distance = Math.max(Math.abs(houndrow - fox.getRow()),
					    Math.abs(houndcolumn - fox.getColumn()));
		  } 
		  while (distance < (numrows + numcols) / 4);

		  h.setRowColumn(houndrow, houndcolumn);
		  field.set(houndrow,houndcolumn,h);
		  hounds.add(h);
	    }
       
	    // put in some random bushes
	    // (since bushes don't do anything, we cheat and use the same bush)
	    i = 0;
	    while(i < numberofbushes){
		  bushrow = random(0, numrows - 1);
		  bushcolumn = random(0, numcols - 1);
		  
		  if (field.get(bushrow,bushcolumn) == null) {
			field.set(bushrow,bushcolumn,BUSH_PIECE);
			i++;
		  }
	    }
       
	    // finish
	    isUnderConstruction = false;
      }
    
      /**
       * Gives one animal a chance to move.
       */
      public void allowSingleMove() {
	    Animal animal;
	    Hound h;
	    Iterator<Hound> hit;
	    Direction direction;
	    int row, column, newrow, newcolumn;
        
	    // make sure it's legal to allow moves
	    if (gameIsOver) 
		  return;
	    	  
	    // decide whose turn it is now        
	    if (isFoxsTurn) {
		  animal = fox;
		  
		  houndit = hounds.iterator(); // Need to iterate through foxes
	    }
	    else { // hounds turn
		  animal = houndit.next();
	    }

	    row = animal.getRow();
	    column = animal.getColumn();
	    newrow = -1;
	    newcolumn = -1;
        
	    // ask the animal to decide a direction
	    direction = animal.decideMove();
	    
	    // if move is legal, do it
	    if (direction != Direction.NONE) {
		  newrow    = row + rowChange(direction);
		  newcolumn = column + columnChange(direction);

		  if(legalLocation(newrow, newcolumn) &&
		     field.get(newrow,newcolumn) != BUSH_PIECE) {
			// perform move
			field.set(row,column,null); // Lookup in other table!!!
			field.set(newrow,newcolumn,animal);
			
			// Save animal position
			animal.setRowColumn(newrow, newcolumn);
		  }
	    }
        
	    // check whether move was fatal for the fox
	    if(isFoxsTurn){// Did the fox move onto a hound
		  hit = hounds.iterator();
		  while(hit.hasNext()){
			h = (Hound) hit.next();
			if (fox.getRow() == h.getRow() && fox.getColumn() == h.getColumn()){
			      foxIsAlive = false;
			      gameIsOver = true;
			} 
		  }
	    }
	    else if(newrow == fox.getRow() && 
		    newcolumn == fox.getColumn()){
		  foxIsAlive = false;
		  gameIsOver = true;
	    }
        
	    // increment steps taken; check for end of game after hounds turn
	
	    if(isFoxsTurn && !hounds.isEmpty()){    
		  stepsTaken++;
		  isFoxsTurn = false;
	    }
	    else if(!houndit.hasNext())
		  isFoxsTurn = true;
      }
            
      /**
       * Gives the fox a chance to move, then gives the hounds
       * a chance to move.
       */
      public void allowMoves() {
	    allowSingleMove(); // Fox
	    for(int i = 0; i < hounds.size(); i ++) // Hounds
		  allowSingleMove();        
      }
    
      /**
       * Returns the number of steps taken so far.
       * @return the number of steps taken
       */
      public int stepsTaken() {
	    return stepsTaken;
      }

      /**
       * Is the game over?
       * @return true if the game is over, otherwise false
       */
      public boolean gameIsOver() {
	    return gameIsOver;
      }
    
      /**
       * Utility method to choose a random integer from min
       * to max, inclusive.
       *
       * @param min the smallest number to be returned
       * @param max the largest number to be returned
       * @return a random number N, where min &lt;= N &lt;= max
       */
      public static int random(int min, int max) {
	    return randomNumberGenerator.nextInt(max - min + 1) + min;
      }

      /**
       * Determines whether the given row and column numbers represent
       * a legal location in the field.
       *
       * @param row    the row number
       * @param column the column number
       */
      public boolean legalLocation(int row, int column) {
	    return (row >= 0 &&
		    row < numberOfRows &&
		    column >= 0 && 
		    column < numberOfColumns);
      }
    
      /**
       * Determines what can be seen from a given location, looking
       * in a given direction.
       *
       * @param animal the animal making the look
       * @param direction  the direction of the look
       * @return the object seen
       */
      public Observation look(Animal animal, Direction direction) {
	    Piece p;
	    Observation obs;
	    int row, column, rowdelta, columndelta, steps;
	    
	    obs = null;
	    row = animal.getRow();
	    column = animal.getColumn();

	    // decode direction into its x-y components
	    rowdelta = rowChange(direction);
	    columndelta = columnChange(direction);
	    steps = 0;
	
	    while (true) {
		  row    += rowdelta;
		  column += columndelta;
		  steps++;
		  
		  if (!legalLocation(row, column)) {
			obs = new Observation(World.EDGE, steps);
			break;
		  }
            
		  p = field.get(row, column);
		  if (p != null){// There is something in this piece
			if (p instanceof Hound)
			      obs = new Observation(World.HOUND, steps);
			//System.out.println("Found Hound");
			//}
			if (p instanceof Fox)
			      obs = new Observation(World.FOX, steps);
			//System.out.println("Found Fox");
			//}
			if (p instanceof Bush)
			      obs = new Observation(World.BUSH, steps);
			//System.out.println("Found Bush");
			//}
			break;
		  }
	    }
        
	    return obs;
      }
    
      /**
       * Determines how moving in the given direction affects the
       * row number.
       *
       * @param direction the direction in which to move
       * @return the amount by which the row number will change
       */
      private int rowChange(Direction direction) {
	    if (direction == Direction.N  ||
		direction == Direction.NE ||
		direction == Direction.NW)
		  return -1;

	    if (direction == Direction.S  ||
		direction == Direction.SE ||
		direction == Direction.SW)
		  return +1;

	    return 0;
      }
    
      /**
       * Determines how moving in the given direction affects the
       * column number.
       *
       * @param direction  the direction in which to move
       * @return the amount by which the column number will change
       */
      private int columnChange(Direction direction) {
	    if (direction == Direction.W  ||
		direction == Direction.NW ||
		direction == Direction.SW)
		  return -1;

	    if (direction == Direction.E  ||
		direction == Direction.NE ||
		direction == Direction.SE)
		  return +1;

	    return 0;
      }
    
      /** Is it the fox's turn?
       * @return true if it is the fox's turn, false otherwise
       */
      public boolean isFoxsTurn() {
	    return isFoxsTurn;
      }
}
