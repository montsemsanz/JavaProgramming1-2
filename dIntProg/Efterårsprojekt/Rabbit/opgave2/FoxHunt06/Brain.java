/**
 * Specifies the expected functionality of a brain in the game.
 */
public abstract class Brain {

    // the world that the brain lives in, used
    // as a context to make decisions
    protected World world = null;

    /**
     * Decides on a direction to move in.
     * @return the direction that the brain has decided
     */
    public abstract Direction decideMove();

    /**
     * Sets the world. This is called after the brain
     * is inserted into an animal.
     * @param w the new world
     */
    public void setWorld(World w) {
        world = w;
    }

}
