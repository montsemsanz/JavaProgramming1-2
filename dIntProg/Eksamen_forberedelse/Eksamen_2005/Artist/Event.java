import java.util.*;
/**
 * Write a description of class Event here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Event
{
    private List<Artist> artists;

    /**
     * Constructor for objects of class Event
     */
    public Event()
    {
        artists = new ArrayList<Artist>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(Artist a)
    {
        artists.add(a);
    }
    
    /**
     * 
     */
    public void remove(Artist a)
    {
        artists.remove(a);
    }
    
    /**
     * 
     */
    public int noOfArtists(int threshold)
    {
        int total = 0;
        for(Artist a : artists) {
            if(a.getPrice() > threshold) {
                total = total + 1;
            }
        }
        return total;
    }
    
    /**
     * 
     */
    public List<Artist> find(String grade)
    {
        List<Artist> result = new ArrayList<Artist>();
        for(Artist a : artists) {
            if(grade.equals(a.getGrade())) {
                result.add(a);
            }
        }
        return result;
    }
    
    /**
     * 
     */
    public void printArtists()
    {
        Collections.sort(artists, new GradeComparator());
        for(Artist a : artists) {
            System.out.println(" " + a);
        }
    }
     
    
}
