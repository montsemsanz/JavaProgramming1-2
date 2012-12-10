
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
        Wine w1 = new Wine("Amarone", 199, 91);
        Wine w2 = new Wine("Tripoli", 89, 50);
        Wine w3 = new Wine("Mont Gras", 150, 100);
        
        System.out.println(w1 + "\n" + w2 + "\n" + w3);
        
        WineAgent wa = new WineAgent("Skovsen");
        wa.add(w1);
        wa.add(w2);
        wa.add(w3);
        
        System.out.println("Grade over 90: " + wa.wineWithGrade(90)); 
        
        wa.printWine();
    
    }
}
