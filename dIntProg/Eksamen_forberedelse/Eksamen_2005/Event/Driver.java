
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
        Event e1 = new Event("2005-10-25", "Koncert", 18000, 4);
        Event e2 = new Event("2003-05-23", "Udstilling", 20000, 3);
        
//         System.out.println(e1 + "\n" + e2);
//         
        Festival f1 = new Festival();
        f1.add(e1);
        f1.add(e2);
        
        System.out.println(f1.noOfEvents("2005-10-25"));
        
        System.out.println(f1.find("Udstilling"));
        
        f1.printEvents();
    }
}
