
/**
 * Write a description of class Playlist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Playlist
{
    private String playlistName;
    private ArrayList<Track> tracks;

    /**
     * Constructor for objects of class Playlist
     */
    public Playlist(String pN)
    {
        playlistName = pN;
        tracks = new ArrayList<Track>();
    }

    public void addTrack(Track t)
    {
        tracks.add(t);
    }
    
    public void removeTrack(Track t)
    {
        tracks.remove(t);
    }   
    
    public Track findShortestTrack()
    {
        Track shortestSoFar = tracks.get(0);
        for(Track t : tracks){
            if(t.getLength() < shortestSoFar.getLength())
            shortestSoFar = t;
        }
        return shortestSoFar;
    }
    
    public void orderByArtist()
    {
        Collections.sort(tracks);
        for(Track t : tracks) {
            System.out.println(t);
        }
    }
  
}
