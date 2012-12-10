import java.util.*;
import java.awt.*;
import javax.swing.*;

/**
 * Creates and maintains a "field" for the rabbit and fox, and sets up
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
 * @version Januar 22, 2006
 */
public class Model {


	private static Bush BUSH_PIECE = new Bush();
	private int numberoffoxes;
	private int numberofswamps;
	private int numberofbushes;
	private ArrayList<Animal> foxes;
	private Iterator<Animal> foxit;
   
	// define instance variables
	private Grid<Piece> field;// Playboard
	private int numberOfRows;
	private int numberOfColumns;
	private Rabbit rabbit;

	private static Random randomNumberGenerator = new Random();
	private static Random seedGenerator = new Random();
	private long oldRandomSeed = 30;
	private boolean isUnderConstruction;
	/** True if rabbit's turn, false if fox's turn */
	private boolean isRabbitsTurn;    
	/** Flag used to end the game when the fox wins */
	private boolean rabbitIsAlive;
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

	    numberoffoxes = 1;
	    numberofbushes = 20;

	    reset();
	}


	/**
	 * Constructs a model that uses a field of the given size.
	 *
	 * @param width The width of the field to be used by the model.
	 * @param height The height of the field to be used by the model.
	 * @param numoffoxes The number of foxes (always 0<) to hunt the rabbit.
	 * @param numofswamp The number of swamps on the field (interpreted as %).
	 * @param numofbush The number of bushes on the field (interpreted as %).
	 */
	public Model(int width, int height, int numoffox, int numofbush) {
	    field = new Grid<Piece>(width, height);

	    NUMBER_OF_ROWS = numberOfRows = width;
	    NUMBER_OF_COLUMNS = numberOfColumns = height;

	    numberoffoxes = ((0 < numoffox)? numoffox : 1);
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
	 * Puts a rabbit, a fox, and some bushes in the field.
	 */
	private void populate(boolean replay) {
	    Fox f;
	    int distance, numrows, numcols,
			foxrow, foxcolumn, 
			rabbitrow, rabbitcolumn, 
			bushrow, bushcolumn, 
			i, j;

	    // protect against calls during creation of game
	    isUnderConstruction = true;

	    gameIsOver = false;
	    rabbitIsAlive = true;
	    isRabbitsTurn = true;
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
		          
	    // put the rabbit in a random location
	    rabbit = new Rabbit(this);
	    rabbit.setBrain(new RabbitBrain());
	    rabbit.setRowColumn(random(0, numrows - 1), 
							random(0, numcols - 1)); 
	    field.set(rabbit.getRow(), rabbit.getColumn(), rabbit);

	    // put foxes in a random location, not too close to the rabbit
	    foxes = new ArrayList<Animal>();
	    for(i = 0; i < numberoffoxes; i++){
			f = new Fox(this);
			f.setBrain(new FoxBrain());

			do {
				foxrow = random(0, numrows - 1);
				foxcolumn = random(0, numcols - 1);
				distance = Math.max(Math.abs(foxrow - rabbit.getRow()),
									Math.abs(foxcolumn - rabbit.getColumn()));
			} 
			while (distance < (numrows + numcols) / 4);

			f.setRowColumn(foxrow, foxcolumn);
			field.set(foxrow,foxcolumn,f);
			foxes.add(f);
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
	    Fox f;
	    Direction direction;
	    Iterator<Animal> fit;
	    int row, column, newrow, newcolumn;
        
	    // make sure it's legal to allow moves
	    if (gameIsOver) 
			return;
	    	  
	    // decide whose turn it is now        
	    if (isRabbitsTurn) {
			animal = rabbit;
		  
			foxit = foxes.iterator(); // Need to iterate through foxes
	    }
	    else { // fox's turn
			animal = foxit.next();
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
        
	    // check whether move was fatal for rabbit
	    if(isRabbitsTurn){// Did the rabbit move onto a fix (Should the fox be killed?!)
			fit = foxes.iterator();
			while(fit.hasNext()){
				f = (Fox) fit.next();
				if (rabbit.getRow() == f.getRow() && rabbit.getColumn() == f.getColumn()){
					rabbitIsAlive = false;
					gameIsOver = true;
				} 
			}
	    }
	    else if(newrow == rabbit.getRow() && 
				newcolumn == rabbit.getColumn()){
			rabbitIsAlive = false;
			gameIsOver = true;
	    }
        
	    // increment steps taken; check for end of game after fox's turn
	
	    if(isRabbitsTurn && !foxes.isEmpty()){    
			stepsTaken++;
			isRabbitsTurn = false;
	    }
	    else if(!foxit.hasNext())
			isRabbitsTurn = true;
	}
            
	/**
	 * Gives the rabbit a chance to move, then gives the fox
	 * a chance to move.
	 */
	public void allowMoves() {
	    allowSingleMove(); // Rabbit
	    for(int i = 0; i < foxes.size(); i ++) //Foxes
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
				if (p instanceof Rabbit)
					obs = new Observation(World.RABBIT, steps);
				//System.out.println("Found Rabbit");
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
    
	/** Is it the rabbit's turn?
	 * @return true if it is the rabbit's turn, false otherwise
	 */
	public boolean isRabbitsTurn() {
	    return isRabbitsTurn;
	}
}
