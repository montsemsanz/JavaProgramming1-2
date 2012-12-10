

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
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }

	public void testPlusEtCiffer()
	{
		CalcEngine calcEngi1 = new CalcEngine();
		calcEngi1.numberPressed(4);
		calcEngi1.enter();
		calcEngi1.numberPressed(3);
		calcEngi1.enter();
		calcEngi1.plus();
		assertEquals(7, calcEngi1.getDisplayValue());
	}

	public void testPlusToCifre()
	{
		CalcEngine calcEngi1 = new CalcEngine();
		calcEngi1.numberPressed(1);
		calcEngi1.numberPressed(1);
		calcEngi1.enter();
		calcEngi1.numberPressed(1);
		calcEngi1.numberPressed(5);
		calcEngi1.enter();
		calcEngi1.plus();
		assertEquals(26, calcEngi1.getDisplayValue());
	}

	public void testMultiply()
	{
		CalcEngine calcEngi2 = new CalcEngine();
		calcEngi2.numberPressed(4);
		calcEngi2.enter();
		calcEngi2.numberPressed(8);
		calcEngi2.enter();
		calcEngi2.multiply();
		assertEquals(32, calcEngi2.getDisplayValue());
	}

	public void testMinus()
	{
		CalcEngine calcEngi1 = new CalcEngine();
		calcEngi1.numberPressed(1);
		calcEngi1.numberPressed(2);
		calcEngi1.enter();
		calcEngi1.numberPressed(2);
		calcEngi1.numberPressed(3);
		calcEngi1.enter();
		calcEngi1.minus();
		assertEquals(11, calcEngi1.getDisplayValue());
	}
	
	public void testDivision()
	{
		CalcEngine calcEngi1 = new CalcEngine();
		calcEngi1.numberPressed(4);
		calcEngi1.enter();
		calcEngi1.numberPressed(1);
		calcEngi1.numberPressed(6);
		calcEngi1.enter();
		calcEngi1.division();
		assertEquals(4, calcEngi1.getDisplayValue());
	}

	public void testTreOperander1()
	{
		CalcEngine calcEngi1 = new CalcEngine();
		calcEngi1.numberPressed(3);
		calcEngi1.enter();
		calcEngi1.numberPressed(3);
		calcEngi1.enter();
		calcEngi1.numberPressed(3);
		calcEngi1.enter();
		calcEngi1.plus();
		calcEngi1.multiply();
		assertEquals(18, calcEngi1.getDisplayValue());
	}

	

	public void testTreOperander2()
	{
		CalcEngine calcEngi2 = new CalcEngine();
		calcEngi2.numberPressed(5);
		calcEngi2.enter();
		calcEngi2.numberPressed(1);
		calcEngi2.numberPressed(1);
		calcEngi2.enter();
		calcEngi2.numberPressed(8);
		calcEngi2.numberPressed(8);
		calcEngi2.enter();
		calcEngi2.division();
		calcEngi2.minus();
		assertEquals(3, calcEngi2.getDisplayValue());
	}

	public void testTreOperander3()
	{
		CalcEngine calcEngi1 = new CalcEngine();
		calcEngi1.numberPressed(3);
		calcEngi1.enter();
		calcEngi1.numberPressed(4);
		calcEngi1.enter();
		calcEngi1.multiply();
		calcEngi1.numberPressed(5);
		calcEngi1.enter();
		calcEngi1.plus();
		assertEquals(17, calcEngi1.getDisplayValue());
	}

	public void testPotensopløftning()
	{
		CalcEngine calcEngi1 = new CalcEngine();
		calcEngi1.numberPressed(4);
		calcEngi1.enter();
		calcEngi1.numberPressed(5);
		calcEngi1.enter();
		calcEngi1.potensopløftning();
		assertEquals(625, calcEngi1.getDisplayValue());
	}

	

	public void testFejlmelding()
	{
		CalcEngine calcEngi1 = new CalcEngine();
		calcEngi1.numberPressed(5);
		calcEngi1.enter();
		calcEngi1.minus();
	}

	public void testFakultet()
	{
		CalcEngine calcEngi1 = new CalcEngine();
		calcEngi1.numberPressed(6);
		calcEngi1.enter();
		calcEngi1.fakultet();
		assertEquals(720, calcEngi1.getDisplayValue());
	}
}

















