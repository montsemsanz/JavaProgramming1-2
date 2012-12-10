
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
        Member m1 = new Member("John Stetson", 47, 67500);
        Member m2 = new Member("Blake Carrington", 65, 100300);
        Member m3 = new Member("Bobby Ewing", 42, 23400);
        Member m4 = new Member("JR Ewing", 55, 110400);
        Member m5 = new Member("Jeff Colby", 43, 67500);
        Member m6 = new Member("Alexis Carrington", 63, 67500);

        Association a = new Association("Oliekartellet");
        a.add(m1);
        a.add(m2);
        a.add(m3);
        a.add(m4);
        a.add(m5);
        a.add(m6);
        
        System.out.println("Guldmedlemmer: " + a.selectGold());
        
        System.out.println("Medlemmet med højeste antal points; ");
        System.out.println(" " + a.highScoreMember());
        
    }
}

