import java.util.*;
/**
 * Write a description of class Playlist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Playlist
{
    private String playlistName;
    private List<Track> tracks;

    /**
     * Constructor for objects of class Playlist
     */
    public Playlist(String pN)
    {
        playlistName = pN;
        tracks = new ArrayList<Track>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void addTrack(Track t)
    {
        tracks.add(t);
    }
    
    /**
     * 
     */
    public void removeTrack(Track t)
    {
        tracks.remove(t);
    }
    
    /**
     * 
     */
    public Track findShortestTrack()
    {
        Track shortestTrackYet = tracks.get(0);
        for(Track t : tracks) {
            if(t.getPlayingTime() < shortestTrackYet.getPlayingTime()) {
                shortestTrackYet = t;
            }
        }
        return shortestTrackYet;
    }
    
    /**
     * 
     */
    public void printTracks()
    {
        Collections.sort(tracks);
        for(Track t : tracks) {
            System.out.println(" " + t);
        }
    }
        
}
