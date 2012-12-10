import java.util.*;
/**
 * Write a description of class TimeSheet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimeSheet implements Comparable<TimeSheet>
{
    private String description;
    private int noOfHours;

    /**
     * Constructor for objects of class TimeSheet
     */
    public TimeSheet(String d, int nOH)
    {
         description = d;
         noOfHours = nOH;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return description + ", " + noOfHours + " " + "time(r)";
    }
    
    /**
     * 
     */
    public int getNoOfHours()
    {
        return noOfHours;
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
    public int compareTo(TimeSheet t)
    {
        if(noOfHours == t.getNoOfHours()) {
            return description.compareTo(t.getDescription());
        }
        return noOfHours - t.getNoOfHours();
    }
    
     
}
