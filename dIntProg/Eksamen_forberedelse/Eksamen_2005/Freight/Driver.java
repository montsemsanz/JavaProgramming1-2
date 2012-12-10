
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
        Freight f1 = new Freight("Møbler", 255, 2);
        Freight f2 = new Freight("Flygel", 200, 3);
        Freight f3 = new Freight("Bornholmerur", 200, 2);
        Freight f4 = new Freight("Skænk", 180, 2);
        
        System.out.println(f1 + "\n" + f2);
        
        Container c = new Container("Los Angeles", 10);
        c.add(f1);
        c.add(f2);
        c.add(f3);
        c.add(f4);
                
        System.out.println("Største fragt: " + "\n" +
        " " + c.largestFreight());
        
        System.out.println("Ledig plads: " + "\n" + 
        " " + c.remainingSpace());
        
        System.out.println("Fragt ordnet efter volumen: ");
        c.printFreight();
        
    }
}
