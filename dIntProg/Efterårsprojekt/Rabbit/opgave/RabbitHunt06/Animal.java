/**
 * Represents an animal.
 * 
 * @author David Matuszek
 * @author Martin Geisler
 * @author Mikkel Kroeigaard
 * @author Casper Torndahl
 * @version Januar 22, 2006
 */
public class Animal extends Piece {

	// a very brainless brain
	private static class DefaultBrain extends Brain {

	    public Direction decideMove() {
			return Direction.NONE;
	    }

	}
    
	private World world;
	private Brain brain;
	private int row; // Row in grid
	private int column; // Coloumn in grid
	private int penalty; // Rounds the animal shall pass its turn

	/**
	 * Constructor for objects of class Animal.
	 *
	 * @param model the model
	 * (needed to create the animal's view of the world)
	 */
	public Animal(Model model) {
	    super(null);
	    world = new World(this, model);

	    // Let's at least have this brain instead of just null. Now it
	    // doesn't crash unless some really evil person sets the brain
	    // to null.
	    brain = new DefaultBrain();
		penalty = 0;
	}
    
	/**
	 * Decides on a direction to move in.
	 * @return the direction to move in
	 */
	public Direction decideMove() {
	    return brain.decideMove();
	}

	/**
	 * Sets the brain.
	 * @param b the new brain
	 */
	public void setBrain(Brain b) {
	    brain = b;
	    brain.setWorld(world);
	}

	/**
	 * Returns the current brain.
	 * @return the current brain
	 */
	public Brain getBrain() {
	    return brain;
	}

	/**
	 * Returns the world in which the animal lives.
	 * @return the world in which the animal lives
	 */
	public World getWorld() {
	    return world;
	}

	/**
	 * Sets the row and column of the animal
	 *
	 * @param r Row of position
	 * @param c Column  of position
	 */
	public void setRowColumn(int r, int c){
	    row = r;
	    column = c;
	}

	/**
	 * Returns the rowposition
	 *
	 * @return Rowposition
	 */
	public int getRow(){
	    return row;
	}

	/**
	 * Returns the columnposition
	 *
	 * @return Columnposition
	 */
	public int getColumn(){
	    return column;
	}

	/** 
	 * Adds penalty rounds to the animals penalty. 
	 * Obviosly the animal should not be penalty 
	 * while having a penalty, since it cannot move.
	 *
	 * @param p The penalty in rounds
	 */
	public void addPenalty(int p){
		penalty = p;
	}

	/**
	 * Returns the penalty, i.e. how many rounds
	 * the animal cannot move.
	 *
	 * @return Penalty in rounds
	 */
	public int getPenalty(){
		return penalty;
	}

	/**
	 * Decreases the penalty by one if 0 < penalty 
	 */
	public void decreasePenalty(){
		if(0 < penalty)
			penalty--;
	}

      /**
       * Returns wether the animal is penaltied
       *
       * @return true if no penalty is found
       */
      public boolean hasPenalty(){
	    return (0 < penalty);
      }
}
