import java.util.*;
/**
 * Write a description of class Beer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beer implements Comparable<Beer> 
{
    private String name;
    private int volume;
    private int price;

    /**
     * Constructor for objects of class Beer
     */
    public Beer(String n, int v, int p)
    {
        name = n;
        volume = v;
        price = p;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return name + ", " + volume + ", " + price + " kr. ";
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
    public double getRatio()
    {
        double dVolume = volume;
        double dPrice = price;
        return dVolume / dPrice;
    }
    
    /**
     * 
     */
    public int compareTo(Beer b)
    {
        if(this.getRatio() < b.getRatio()) {
            return -1;
        }
        if(this.getRatio() > b.getRatio()) {
            return 1;
        }
        return 0;
    }
            
        
}
