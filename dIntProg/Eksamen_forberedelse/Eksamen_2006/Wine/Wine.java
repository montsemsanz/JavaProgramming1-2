import java.util.*;
/**
 * Write a description of class Wine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wine implements Comparable<Wine>
{
    private String name;
    private int price;
    private int grade;

    /**
     * Constructor for objects of class Wine
     */
    public Wine(String n, int p, int g)
    {
        name = n;
        price = p;
        grade = g;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return name + ", " + price + ", " + grade;
    }
    
    /**
     * 
     */
    public int getGrade()
    {
        return grade;
    }
    
    
    /**
     * 
     */
    public int compareTo(Wine w)
    {
        return grade - w.getGrade();
    }
     
     
}
