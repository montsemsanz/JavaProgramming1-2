import java.util.*;
/**
 * Write a description of class ScoutGroup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoutGroup implements Comparable<ScoutGroup>
{
    private String name;
    private String area;
    private int members;

    /**
     * Constructor for objects of class ScoutGroup
     */
    public ScoutGroup(String n, String a, int m)
    {
        name = n;
        area = a;
        members = m;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return name + ", " + area + ", " + members + " medlemmer.";
    }
    
    /**
     * 
     */
    public String getArea()
    {
        return area;
    }
     
    /**
     * 
     */
    public int getMembers()
    {
        return members;
    }
    
    /**
     * 
     */
    public int compareTo(ScoutGroup sg)
    {
        if(area == sg.getArea()) {
            return members - sg.getMembers();
        }
        return area.compareTo(sg.getArea());
    }
     
}
