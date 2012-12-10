
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
        Track t1 = new Track("Yesterday", "The Beatles", 2, 25);
        Track t2 = new Track("Imagine", "The Beatles", 3, 45);
        Track t3 = new Track("When I'm Sixty Four", "The Beatles", 4, 10);
        Track t4 = new Track("Elinor Rigby", "The Beatles", 3, 15);
        Track t5 = new Track("Come Together", "The Beatles", 3, 32);
        Track t6 = new Track("A Hard Days Night", "The Beatles", 2, 55);
               
    
//         System.out.println(t1 + "\n" + t2);
//         
        Playlist p1 = new Playlist("Oldies");
        p1.addTrack(t1);
        p1.addTrack(t2);
        p1.addTrack(t3);
        p1.addTrack(t4);
        p1.addTrack(t5);
        p1.addTrack(t6);
                
//         System.out.println(t1.getLength());
//         
        p1.orderByArtist();
    }

    
}
