

/**
 * The test class MMSTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MMSTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class MMSTest
     */
    public MMSTest()
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

	public void testAddMultimedie()
	{
		MMS mMS2 = new MMS("22420513");
		Multimedie multimed1 = new Multimedie(3, "jpg-billede");
		Multimedie multimed2 = new Multimedie(2, "gif-billede");
		mMS2.add(multimed1);
		mMS2.add(multimed2);
		assertEquals(5, mMS2.getTotalSize());
	}

	public void testRemoveMultimedie()
	{
		MMS mMS1 = new MMS("22420513");
		Multimedie multimed1 = new Multimedie(3, "jpg-billede");
		Multimedie multimed2 = new Multimedie(2, "gif-billede");
		mMS1.add(multimed1);
		mMS1.add(multimed2);
		mMS1.remove(multimed1);
		assertEquals(2, mMS1.getTotalSize());
	}

	public void testGetTotalSize()
	{
		MMS mMS2 = new MMS("22420513");
		Multimedie multimed1 = new Multimedie(3, "jpg-billede");
		Multimedie multimed2 = new Multimedie(2, "gif-billede");
		Multimedie multimed3 = new Multimedie(4, "mp3-fil");
		mMS2.add(multimed1);
		mMS2.add(multimed2);
		mMS2.add(multimed3);
		assertEquals(9, mMS2.getTotalSize());
	}

	public void testGetAmountUdenKiloBytes()
	{
		MMS mMS1 = new MMS("22420513");
		assertEquals(0, mMS1.getAmount());
	}

	public void testGetAmountReturner1()
	{
		MMS mMS1 = new MMS("22420513");
		Multimedie multimed1 = new Multimedie(3, "jpg-billede");
		mMS1.add(multimed1);
		assertEquals(1, mMS1.getAmount());
	}

	public void testGetAmountReturner3()
	{
		MMS mMS1 = new MMS("22420513");
		Multimedie multimed1 = new Multimedie(3, "jpg-billede");
		Multimedie multimed2 = new Multimedie(2, "gif-billede");
		Multimedie multimed3 = new Multimedie(5, "mp3-fil");
		mMS1.add(multimed1);
		mMS1.add(multimed2);
		mMS1.add(multimed3);
		assertEquals(3, mMS1.getAmount());
	}

	public void testGetAmountReturner5()
	{
		MMS mMS1 = new MMS("22420513");
		Multimedie multimed1 = new Multimedie(50, "mp3-filer");
		mMS1.add(multimed1);
		assertEquals(5, mMS1.getAmount());
	}

	public void testGetAmountForMangeKiloBytes()
	{
		MMS mMS1 = new MMS("22420513");
		Multimedie multimed1 = new Multimedie(50, "mp3-filer");
		Multimedie multimed2 = new Multimedie(50, "mp3-filer");
		mMS1.add(multimed1);
		mMS1.add(multimed2);
		assertEquals(0, mMS1.getAmount());
	}
}








