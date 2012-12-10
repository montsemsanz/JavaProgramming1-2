
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
        Picture p1 = new Picture(100, 100, 15);
        Picture p2 = new Picture(200, 200, 16);
               
        System.out.println(p1 + "\n" + p2);
        
        MemoryCard m1 = new MemoryCard("M43");
        m1.addPicture(p1);
        m1.addPicture(p2);
                
        System.out.println(m1.getAll(100));
        
    }
}