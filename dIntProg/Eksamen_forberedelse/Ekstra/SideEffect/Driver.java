
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    public static void exam()
    {
        SideEffect s1 = new SideEffect("udslet", 27);
        SideEffect s2 = new SideEffect("svimmelhed", 58);
        SideEffect s3 = new SideEffect("hovedpine", 74);
        SideEffect s4 = new SideEffect("kvalme", 45);
    
        System.out.println(s1 + "\n" + s2);
        
        Medicine m = new Medicine("SFT-40");
        m.addSideEffect(s1);
        m.addSideEffect(s2);
        m.addSideEffect(s3);
        m.addSideEffect(s4);
        
        System.out.println("Den totale risiko: " + "\n" + m.totalRisc());
        
        System.out.println("Den værste bivirkning: " + "\n" + 
        m.worstSideEffect());
    }
}
