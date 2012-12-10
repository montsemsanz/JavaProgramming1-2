
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
        Painting p1 = new Painting("Vincent Van Gogh", "Starry Night", 1889, 3452);
        Painting p2 = new Painting("Edward Munch", "Skriget", 1912, 3352);
        Painting p3 = new Painting("Edgar Degas", "Picnic", 1870, 2453);
        Painting p4 = new Painting("Pablo Picasso", "Cubic", 1925, 3987);
        
        System.out.println(p1 + "\n" + p2 + "\n" + p3 + "\n" + p4);
        
        Museum m1 = new Museum("MOMA");
        m1.add(p1);
        m1.add(p2);
        m1.add(p3);
        m1.add(p4);
        
        System.out.println("Oldest Painting:");
        System.out.println(m1.oldestPainting());
        
        System.out.println("Most expensive painting: " + "\n" 
        + m1.mostExpensive()); 
        
    }    
    
}
