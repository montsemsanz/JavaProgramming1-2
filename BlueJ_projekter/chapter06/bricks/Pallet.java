
/**
 * A palette is a stack of bricks on a wooden base.
 *
 * @author: Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */
public class Pallet
{
    private static final double BASE_WEIGHT = 6.5;  // in kg
    private static final double BASE_HEIGHT = 15.0;  // in cm

    private Brick brick;
    private double bricksInPlane;
    private double bricksInHeight;

    /**
     * Create a palette with a given number of bricks.
     * @param bricksInPlane The number of bricks in each level on the base.
     * @param height The number of bricks stacked on top of each other.
     */
    public Pallet(double bricksInPlane, double bricksInHeight)
    {
        brick = new Brick(8, 10, 12);
        this.bricksInPlane = bricksInPlane;
        this.bricksInHeight = bricksInHeight;
    }
    
    /**
     * 
     */
    public double numberOfBricks()
    {
        return bricksInPlane * bricksInHeight;
    }

    /**
     * @return The base of the palette (in kg)
     */
    public double getWeightOfPallet()
    {
        return (brick.getWeight() * numberOfBricks()) + BASE_WEIGHT;
    }

    /**
     * @return The height of this stack (in cm)
     */
    public double getHeightOfPallet()
    {
        return (brick.getHeight() * bricksInHeight) + BASE_HEIGHT;
    }
}
