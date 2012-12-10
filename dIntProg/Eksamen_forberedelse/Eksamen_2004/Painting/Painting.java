import java.util.*;
/**
 * Write a description of class Painting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Painting implements Comparable<Painting>
{
    private String artist;
    private String name;
    private int year;
    private int value;

    /**
     * Constructor for objects of class Painting
     */
    public Painting(String a, String n, int y, int v)
    {
        artist = a;
        name = n; 
        year = y;
        value = v;
    }

    /**
     * 
     */
    public String toString()
    {
        return artist + ", " + name + " " + ", " + year + ", " + value; 
    }
    
    /**
     * 
     */
    public int getYear(){
        return year;
    }    
    
    /**
     * 
     */
    public int compareTo(Painting p){
        return year - p.getYear();
    }
    
    /**
     * 
     */
    public int getValue(){
        return value;
    }
}
