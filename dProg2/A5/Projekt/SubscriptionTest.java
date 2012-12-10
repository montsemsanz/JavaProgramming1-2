

/**
 * The test class SubscriptionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SubscriptionTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class SubscriptionTest
     */
    public SubscriptionTest()
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

	public void testInitialisering()
	{
		Subscription subscrip1 = new Subscription("22420513");
		assertEquals(200, subscrip1.getBalance());
	}

	public void testAddTransaction()
	{
		Subscription subscrip1 = new Subscription("22420513");
		Call call1 = new Call(13, "22851992");
		subscrip1.add(call1);
		assertEquals(187, subscrip1.getBalance());
	}

	public void testAddMultipleT()
	{
		Subscription subscrip1 = new Subscription("22420513");
		Call call1 = new Call(13, "22851992");
		SMS sMS1 = new SMS("22857371", "Hej");
		Payment payment1 = new Payment(150);
		subscrip1.add(call1);
		subscrip1.add(sMS1);
		subscrip1.add(payment1);
		assertEquals(336, subscrip1.getBalance());
	}
}



