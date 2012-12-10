import java.util.*;
/**
 * Write a description of class Freight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Freight implements Comparable<Freight>
{
    private String description;
    private int weight;
    private int volume;

    /**
     * Constructor for objects of class Freight
     */
    public Freight(String d, int w, int v)
    {
        description = d;
        weight = w;
        volume = v;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return description + ", " + weight + " kg, " + volume + " m3.";
    }
    
    /**
     * 
     */
    public int getVolume()
    {
        return volume;
    }
    
    /**
     * 
     */
    public int getWeight()
    {
        return weight;
    }
    
    /**
     * 
     */
    public int compareTo(Freight f)
    {
        if(volume == f.getVolume()) {
            return weight - f.getWeight();
        }
        return volume - f.getVolume();
    }
}
