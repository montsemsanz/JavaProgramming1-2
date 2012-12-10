
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
        Plane p1 = new Plane("Airbus 340-300", 250, 14800);
        Plane p2 = new Plane("Dash 4-800", 250, 10500);
        Plane p3 = new Plane("Airbus 500-200", 250, 16800);
        
        System.out.println(p1 + "\n" + p2 + "\n" + p3);
        
        AirlineCompany a = new AirlineCompany("SAS");
        a.add(p1);
        a.add(p2);
        a.add(p3);
        
        System.out.println("Fly med kapacitet mellem 200 og 300: " + "\n" + 
        " " + a.select(200, 300));
        
        System.out.println("Fly ordnet efter kapacitet og rækkevidde: " + 
        " ");
        a.printPlanes(); 
    }
        
}
