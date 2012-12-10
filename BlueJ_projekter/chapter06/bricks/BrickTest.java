
/**
 * The test class BrickTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BrickTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class BrickTest
     */
    public BrickTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }
    
    /**
     *
     */
    
    public void testGetSurfaceArea()
    {
        Brick b = new Brick(4, 4, 4);
        assertEquals(96.0, b.getSurfaceArea());
    }
    
    /**
     * 
     */
    public void testGetVolume()
    {
        Brick b = new Brick(4, 4, 4);
        assertEquals(64.0, b.getVolume());
    }
    
    /**
     * 
     */
    public void testGetWeight()
    {
        Brick b = new Brick(4, 4, 4);
        assertEquals(0.128, b.getWeight());
    }
    
    /**
     * 
     */
    public void testGetHeight()
    {
        Brick b = new Brick(4, 4, 4);
        assertEquals(4.0, b.getHeight());
    }
}
