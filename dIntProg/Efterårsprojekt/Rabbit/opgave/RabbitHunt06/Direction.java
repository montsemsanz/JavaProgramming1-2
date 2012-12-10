/**
 * This class defines all possible directions. There are eight
 * possibilities, and no other directions may be constructed.
 *
 * @author David Matuszek 
 * @author Martin Geisler
 * @author Mikkel Kroeigaard
 * @version August 22, 2005
 */
public final class Direction {

    // a Direction can never be constructed outside this class
    private Direction() {}

    public static final Direction N  = new Direction();
    public static final Direction NE = new Direction();
    public static final Direction E  = new Direction();
    public static final Direction SE = new Direction();
    public static final Direction S  = new Direction();
    public static final Direction SW = new Direction();
    public static final Direction W  = new Direction();
    public static final Direction NW = new Direction();
    
    // NONE indicates that we are not going anywhere
    public static final Direction NONE = new Direction();

    // for convenience, we provide an array of all directions
    public static final Direction[] DIRECTIONS
        = {N, NE, E, SE, S, SW, W, NW};

    /**
     * Given a direction and a number of times to make 1/8 turn
     * clockwise, return the resultant direction.
     *
     * The direction {@link Direction#NONE} never changes by turning.
     *
     * @param direction the initial direction
     * @param number of 45 degree turns clockwise
     * @return the direction after the turns
     */
    public static Direction turn(Direction direction, int number) {
        if (direction == NONE)
            return NONE;
        
        int index;
        for(index=0;index<DIRECTIONS.length;index++)
            if (DIRECTIONS[index] == direction)
                break;
        
        // Add Move.DIRECTIONS.length to ensure that the following
        // modulo is positive.
        index += number + DIRECTIONS.length;
        return DIRECTIONS[index % DIRECTIONS.length];
    }
    
    /**
     * Utility method to choose a move in a random direction.
     *
     * @return a random direction
     */
    public static Direction randomDirection() {
        return DIRECTIONS[Model.random(0,DIRECTIONS.length-1)];
    }
}
