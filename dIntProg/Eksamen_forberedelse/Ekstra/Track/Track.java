import java.util.*;
/**
 * Write a description of class Track here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Track implements Comparable<Track>
{
    private String artist;
    private String songName;
    private int min;
    private int sec;

    /**
     * Constructor for objects of class Track
     */
    public Track(String a, String sN, int m, int s)
    {
        artist = a;
        songName = sN;
        min = m;
        sec = s;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return songName + ": " + artist + " (" + min + ":" + sec + ")";
    }
    
    /**
     * 
     */
    public int getPlayingTime()
    {
        return ((min * 60) + sec);
    }
    
    /**
     * 
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * 
     */
    public String getSongName()
    {
        return songName;
    }
    
    /**
     * 
     */
    public int compareTo(Track t)
    {
        if(artist.equals(t.getArtist())) {
            return songName.compareTo(t.getSongName());
        }
        return artist.compareTo(t.getArtist());
               
    }
        
}
