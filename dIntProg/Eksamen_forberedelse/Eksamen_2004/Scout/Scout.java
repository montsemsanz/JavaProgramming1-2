import java.util.*;
/**
 * Write a description of class Scout here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scout implements Comparable<Scout>
{
    private String dateOfBirth;
    private String name;
    private int marks;

    /**
     * Constructor for objects of class Scout
     */
    public Scout(String dOB, String n, int m)
    {
        dateOfBirth = dOB;
        name = n;
        marks = m;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return dateOfBirth + ", " + name + ", " + marks + " mærker.";
    }
    
    /**
     * 
     */
    public int getMarks()
    {
        return marks;
    }
    
    /**
     * 
     */
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
    
    /**
     * 
     */
    public int compareTo(Scout s)
    {
        if(marks == s.getMarks()) {
            return dateOfBirth.compareTo(s.getDateOfBirth());
        }
        return marks - s.getMarks();
    }
     
}
