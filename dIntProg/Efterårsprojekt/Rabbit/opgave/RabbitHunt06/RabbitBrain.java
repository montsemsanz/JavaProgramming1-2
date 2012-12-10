/**
 * The rabbit's brain. 
 *
 * @author Mikkel Kroeigaard
 * @version August 22, 2005
 */

public class RabbitBrain extends Brain {

    // instance variables
    private boolean haveSeenFox = false;
    private boolean canSeeFoxNow = false;
    private int distanceToFox;
    private Direction directionToFox;
    private Direction currentDirection;
    private int i;
    
    public RabbitBrain() {
        i = 0;
    }

    /**
     * Decides on a direction in which to move.
     * @return the direction in which the rabbit wants to move
     */
    public Direction decideMove() {
        // by default this brain does nothing
        // delete the next line and insert your own code
        // look all around 
        return Direction.NONE;
    }
}
