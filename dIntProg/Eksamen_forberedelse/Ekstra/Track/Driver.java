
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
        Track t1 = new Track("The Beatles", "Yesterday", 2, 05);
        Track t2 = new Track("The Beatles", "Come Together", 3, 17);
        Track t3 = new Track("The Beatles", "Elinor Rigby", 2, 34);
        Track t4 = new Track("Raveonettes", "Love In A TrashCan", 4, 23);
        Track t5 = new Track("Kashmir", "Love In A TrashCan", 2, 04);
        Track t6 = new Track("Private", "Love In A TrashCan", 3, 32);
        
        System.out.println(t1 + "\n" + t2);
        
        Playlist p = new Playlist("Musik til afslapning");
        p.addTrack(t1);
        p.addTrack(t2);
        p.addTrack(t3);
        p.addTrack(t4);
        p.addTrack(t5);
        p.addTrack(t6);
        
        System.out.println("Det korteste track i playlisten:" + "\n" +
        " " + p.findShortestTrack());
        
        System.out.println("Tracks ordnet efter kunster og navn på track: ");
        p.printTracks();
    }

}
