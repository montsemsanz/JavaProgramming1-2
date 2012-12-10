
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
        Plane p1 = new Plane("Airbus 340-300", 295, 14800);
        Plane p2 = new Plane("Airbus 500-240", 350, 13600);
        Plane p3 = new Plane("Airbus 340-300", 295, 15800);
        Plane p4 = new Plane("Airbus 500-240", 350, 17600);
        Plane p5 = new Plane("Airbus 340-300", 295, 19800);
        Plane p6 = new Plane("Airbus 500-240", 350, 12600);
        
        System.out.println(p1 + "\n" + p2);
        
        AirlineCompany ac = new AirlineCompany("SAS");
        ac.add(p1);
        ac.add(p2);
        ac.add(p3);
        ac.add(p4);
        ac.add(p5);
        ac.add(p6);
        
        System.out.println("Fly med passagerkapacitet mellem 200 og 300: " +
        "\n" + ac.select(200, 300));
        
        System.out.println("Fly ordnet efter kapacitet og rækkevidde: ");
        ac.printPlanes();
        
       
    }

}
