import java.util.*;
/**
 * Write a description of class Instrument here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instrument implements Comparable<Instrument>
{
    private String description;
    private int value;

    /**
     * Constructor for objects of class Instrument
     */
    public Instrument(String d, int v)
    {
        description = d;
        value = v;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return description + ", " + value + " kr.";
    }
    
    /**
     * 
     */
    public int getValue()
    { 
        return value;
    }
    
    /**
     * 
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * 
     */
    public int compareTo(Instrument i)
    {
        if(value == i.getValue()) {
            return description.compareTo(i.getDescription());
        }
        return value - i.getValue();
    }
}
