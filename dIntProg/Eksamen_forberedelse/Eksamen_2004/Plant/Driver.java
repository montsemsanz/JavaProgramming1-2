
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
        Plant p1 = new Plant("Rose", 53, 12);
        Plant p2 = new Plant("Tulipan", 34, 45);
        
        System.out.println(p1 + "\n" + p2);
        
        Allotment a1 = new Allotment("Smørumgaardsvej");
        a1.addPlant(p1);
        a1.addPlant(p2);
        
        System.out.println("Total værdi:" + " " + a1.totalValue());
        
        System.out.println("Bedste plante:" + " " + a1.bestPlant()); 
    }
}
