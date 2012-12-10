
/**
 * The test class PTQueueListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PTQueueListTest extends junit.framework.TestCase
{

    private PTQueue<Integer> ptq;
    
    /**
     * Default constructor for test class PTQueueListTest
     */
    public PTQueueListTest() {
        ptq= new PTQueueList<Integer>();
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp() {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown() {}
    
    public void testSize() {
        ptq.add(2).add(1).add(3);
        assertEquals(3, ptq.size());
    }
    
    public void testIsEmpty() {
        assertEquals(true, ptq.isEmpty());
        ptq.add(1);
        assertEquals(false, ptq.isEmpty());
        ptq.removeMin();
        assertEquals(true, ptq.isEmpty());
    }
    
    public void testAdd() {
        ptq.add(1);
        assertEquals(new Integer(1), ptq.min());
    }
    
    public void testMin() {
        ptq.add(2).add(1).add(3);
        assertEquals(new Integer(1), ptq.min());
    }
    
    public void testRemoveMin() {
        ptq.add(2).add(1).add(3);
        ptq.removeMin();
        assertEquals(new Integer(2), ptq.min());
    }
}
