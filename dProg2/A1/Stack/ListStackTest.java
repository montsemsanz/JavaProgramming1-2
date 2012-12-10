
/**
 * The test class ListStackTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ListStackTest extends junit.framework.TestCase
{
    private Stack<Integer> stk; 
    /**
     * Default constructor for test class ListStackTest
     */
    public ListStackTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
        stk = new ListStack<Integer>();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }
    
    public void testSize() {
        stk.push(2);
        stk.push(1);
        stk.push(3);
        assertEquals(3, stk.size());
    }
    
    public void testIsEmpty() {
        assertEquals(true, stk.isEmpty());
        stk.push(1);
        assertEquals(false, stk.isEmpty());
        stk.pop();
        assertEquals(true, stk.isEmpty());
    }
    
    public void testPush() {
        stk.push(1);
        stk.push(3);
        assertEquals(new Integer(3), stk.top());
        stk.push(2);
        assertEquals(new Integer(2), stk.top());
    }
    
    public void testTop() {
        stk.push(2);
        stk.push(1);
        stk.push(3);
        assertEquals(new Integer(3), stk.top());
    }
    
    public void testPop() {
        stk.push(2);
        stk.push(1);
        stk.push(3);
        assertEquals(new Integer(3), stk.top());
        stk.pop();
        assertEquals(new Integer(1), stk.top());
    }

    
}
