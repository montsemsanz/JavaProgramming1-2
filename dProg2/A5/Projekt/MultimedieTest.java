

/**
 * The test class MultimedieTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MultimedieTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class MultimedieTest
     */
    public MultimedieTest()
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

	public void testGetSize()
	{
		Multimedie multimed2 = new Multimedie(3, "jpg-billede");
		assertEquals(3, multimed2.getSize());
	}
}

