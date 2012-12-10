
/**
 * The test class CalcEngineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CalcEngineTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class CalcEngineTest
     */
    public CalcEngineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
    CalcEngine c = new CalcEngine();
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
    public void testPlus()
    {
        CalcEngine c = new CalcEngine();
        c.numberPressed(18);
        c.plus();
        c.numberPressed(9);
        c.equals();
        assertEquals(27, c.getDisplayValue());
    }
        
    /**
     * 
     */
    public void testMinus()
    {
        CalcEngine c = new CalcEngine();
        c.numberPressed(21);
        c.minus();
        c.numberPressed(12);
        c.equals();
        assertEquals(9, c.getDisplayValue());
    }
        
    /**
     * 
     */
    public void testSerie1()
    {
        CalcEngine c = new CalcEngine();
        c.numberPressed(23);
        c.plus();
        c.numberPressed(25);
        c.plus();
        c.numberPressed(12);
        c.equals();
        assertEquals(60, c.getDisplayValue());
    }
    
    /**
     * 
     */
    public void testSerie2()
    {
        CalcEngine c = new CalcEngine();
        c.numberPressed(25);
        c.minus();
        c.numberPressed(23);
        c.minus();
        c.numberPressed(12);
        c.plus();
        c.numberPressed(17);
        c.equals();
        assertEquals(7, c.getDisplayValue());
    }
     
    /**
     * 
     */
    public void testSerie3()
    {
        CalcEngine c = new CalcEngine();
        c.numberPressed(23);
        c.minus();
        c.numberPressed(12);
        c.plus();
        c.numberPressed(16);
        c.equals();
        assertEquals(27, c.getDisplayValue());
    }
    
    /**
     * 
     */
    public void testSerie4()
    {
        CalcEngine c = new CalcEngine();
        c.numberPressed(17);
        c.plus();
        c.numberPressed(23);
        c.minus();
        c.numberPressed(-15);
        c.plus();
        c.numberPressed(8);
        c.equals();
        assertEquals(63, c.getDisplayValue());
    }
        
         
}
