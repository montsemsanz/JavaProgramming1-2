import java.util.*;
/**
 * Write a description of class CinemaShow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CinemaShow implements Comparable<CinemaShow>
{
    private String movie;
    private String date;
    private String time;
    private int spectators;

    /**
     * Constructor for objects of class CinemaShow
     */
    public CinemaShow(String m, String d, String t, int s)
    {
        movie = m;
        date = d;
        time = t;
        spectators = s;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return movie + ", " + date + ", " + time + ", " + spectators;
    }
    
    /**
     * 
     */ 
    public int getSpectators()
    {
        return spectators;
    }
    
    /**
     * 
     */
    public String getDate()
    {
        return date;
    }
    
    /**
     * 
     */
    public String getTime()
    {
        return time;
    }
    
    /**
     * 
     */
    public String getMovie()
    {
        return movie;
    }
    
    
    /**
     * 
     */
    public int compareTo(CinemaShow cs)
    {
        if(date.equals(cs.getDate())) {
            return time.compareTo(cs.getTime());
        }
        return date.compareTo(cs.getDate());
    }
            
     
}
