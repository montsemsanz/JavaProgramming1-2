import java.util.*;
/**
 * Write a description of class Magazine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Magazine implements Comparable<Magazine>
{
    private String name;
    private int prize;

    /**
     * Constructor for objects of class Magazine
     */
    public Magazine(String n, int p)
    {
        name = n;
        prize = p;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return name + ", " + " kr. " + prize;
    }
    
    /**
     * 
     */
    public int getPrize()
    {
        return prize;
    }
    
    /**
     * 
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * 
     */
    public int compareTo(Magazine m)
    {
        return name.compareTo(m.getName());
    }    
     
}
