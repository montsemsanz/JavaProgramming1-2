

/**
 * The test class CallTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CallTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class CallTest
     */
    public CallTest()
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

	public void testGetAmount()
	{
		Call call2 = new Call(23, "55432176");
		assertEquals(-23, call2.getAmount());
	}
}

