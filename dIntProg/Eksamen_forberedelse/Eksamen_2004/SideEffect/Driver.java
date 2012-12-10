
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main(String[] args)
    {
        SideEffect s1 = new SideEffect("Udslet", 27);
        SideEffect s2 = new SideEffect("Kvalme", 85);
        
        System.out.println(s1 + "\n" + s2);
        
        Medicine m1 = new Medicine("RTP 345");
        m1.addSideEffect(s1);
        m1.addSideEffect(s2);
        
        System.out.println("Den totale risiko:" + " " + m1.totalRisc());
        
        System.out.println("Den værste bivirkning:" + " " + m1.worstSideEffect());
    }
}
