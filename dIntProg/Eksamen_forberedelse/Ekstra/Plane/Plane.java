import java.util.*;
/**
 * Write a description of class Plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane implements Comparable<Plane>
{
    private String name;
    private int capacity;
    private int range;

    /**
     * Constructor for objects of class Plane
     */
    public Plane(String n, int c, int r)
    {
        name = n;
        capacity = c;
        range = r;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return name + ", " + capacity + ", " + range;
    }
    
    /**
     * 
     */
    public int getCapacity()
    {
        return capacity;
    }
    
    /**
     * 
     */
    public int getRange()
    {
        return range;
    }
    
    /**
     * 
     */
    public int compareTo(Plane p)
    {
        if(capacity == p.getCapacity()) {
            return range - p.getRange();
        }
        return capacity - p.getCapacity();
    }
}
