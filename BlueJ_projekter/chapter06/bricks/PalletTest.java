

/**
 * The test class PalletTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PalletTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class PalletTest
     */
    public PalletTest()
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
    public void testNumberOfBricks()
    {
        Pallet p = new Pallet(50, 50);
        assertEquals(2500.0, p.numberOfBricks());
    }
    
    /**
     * 
     */
    public void testGetWeightOfPallet()
    {
        Pallet p = new Pallet(50, 50);
        assertEquals(4806.5, p.getWeightOfPallet());
    }
    
    /**
     * 
     */
    public void testGetHeightOfPallet()
    {
        Pallet p = new Pallet(50, 50);
        assertEquals(415.0, p.getHeightOfPallet());
    }
}
