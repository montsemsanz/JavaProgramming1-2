import java.util.*;
/**
 * Plane is a class, that lets you create Plane objects.
 * 
 * @author Susie Agerholm
 * @version 02-04-2010
 */
public class Plane implements Comparable<Plane>
{
    private String name;
    private int capacity;
    private int range;

    /**
     * Creates an object of type Plane
     */
    public Plane(String n, int c, int r)
    {
        name = n;
        capacity = c;
        range = r;
    }

    /**
     * Returns a string with planes name, capacity and range 
     */
    public String toString()
    {
        return name + ", " + capacity + ", " + range;
    }
    
    /**
     * Returns capacity of the Plane object
     */
    public int getCapacity()
    {
        return capacity;
    }
    
    /**
     * Returns range of the Plane object 
     */
    public int getRange()
    {
        return range;
    }
    
    /**
     * Compares planes according to capacity and range secondary
     */
    public int compareTo(Plane p)
    {
        if(capacity == p.getCapacity()) {
            return range - p.getRange();
        }
        return capacity - p.getCapacity();
    }
}
