import java.util.*;
/**
 * Write a description of class Measurement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Measurement implements Comparable<Measurement>
{
    private String date;
    private String place;
    private int temp;

    /**
     * Constructor for objects of class Measurement
     */
    public Measurement(String d, String p, int t)
    {
        date = d;
        place = p;
        temp = t;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return date + ", " + place + ", " + temp + " celsius.";
    }
    
    /**
     * 
     */
    public int getTemp()
    {
        return temp;
    }
     
    /**
     * 
     */
    public String getPlace()
    {
        return place;
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
    public int compareTo(Measurement m)
    {
        if(date == m.getDate()) {
            return place.compareTo(m.getPlace());
        }
        if(place == m.getPlace()) {
            return temp - getTemp();
        }
        return date.compareTo(m.getDate());
    }
}