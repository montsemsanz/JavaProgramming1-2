import java.util.*;
/**
 * Write a description of class Event here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Event implements Comparable<Event>
{
    private String date;
    private String kind;
    private int price;
    private int noOfArtists;

    /**
     * Constructor for objects of class Event
     */
    public Event(String d, String k, int p, int nOA)
    {
        date = d;
        kind = k;
        price = p;
        noOfArtists = nOA;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return date + ", " + kind + ", " + price + " kr., " + noOfArtists + 
        " personer.";
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
    public String getKind()
    {
        return kind;
    }
    
    /**
     * 
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * 
     */
    public int compareTo(Event e)
    {
        if(kind.equals(e.getKind())) {
            return price - e.getPrice();
        }
        return kind.compareTo(e.getKind());
    }
}
