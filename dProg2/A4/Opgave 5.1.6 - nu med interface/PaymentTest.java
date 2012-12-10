

/**
 * The test class PaymentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PaymentTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class PaymentTest
     */
    public PaymentTest()
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
		Payment payment1 = new Payment(150);
		assertEquals(150, payment1.getAmount());
	}
}

