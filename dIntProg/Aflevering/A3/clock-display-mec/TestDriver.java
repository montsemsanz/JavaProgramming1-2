
/**
 * Class to test the ClockDisplay (and NumberDisplay) class(es).
 * 
 * @author Michael E. Caspersen
 * @version 2005.09.04
 */
public class TestDriver
{
    public static void run() {
        ClockDisplay c = new ClockDisplay(21, 28);
        
        System.out.println("Initialize time to 21:28");
        System.out.println(c.getTime());
        c.timeTick();
        System.out.println("timeTick");
        System.out.println(c.getTime());
        
        System.out.println();
        System.out.println("setTime to 21:59");
        c.setTime(21, 59);
        System.out.println(c.getTime());
        c.timeTick();
        System.out.println("timeTick");
        System.out.println(c.getTime());

        System.out.println();
        System.out.println("setTime to 23:59");
        c.setTime(23, 59);
        System.out.println(c.getTime());
        c.timeTick();
        System.out.println("timeTick");
        System.out.println(c.getTime());
    }
}
