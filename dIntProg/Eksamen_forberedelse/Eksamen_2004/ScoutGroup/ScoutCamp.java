import java.util.*;
/**
 * Write a description of class ScoutCamp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoutCamp
{
    private String name;
    private List<ScoutGroup> scoutgroups;

    /**
     * Constructor for objects of class ScoutCamp
     */
    public ScoutCamp(String n)
    {
        name = n;
        scoutgroups = new ArrayList<ScoutGroup>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(ScoutGroup sg)
    {
        scoutgroups.add(sg);
    }
    
    /**
     * 
     */
    public void remove(ScoutGroup sg)
    {
        scoutgroups.remove(sg);
    }
     
    /**
     * 
     */
    public int noOfScoutGroups(String area)
    {
        int total = 0;
        for(ScoutGroup s : scoutgroups) {
            if(s.getArea() == area) {
                total = total + 1;
            }
        }
        return total;
    }
    
    /**
     * 
     */
    public List<ScoutGroup> find(String area)
    {
        List<ScoutGroup> groupFromArea = new ArrayList<ScoutGroup>();
        for(ScoutGroup s : scoutgroups) {
            if(s.getArea() == area) {
                groupFromArea.add(s);
            }
        }
        return groupFromArea;
    }
    
    /**
     * 
     */
    public void printScoutGroups()
    {
        Collections.sort(scoutgroups);
        for(ScoutGroup sg : scoutgroups) {
            System.out.println(sg);
        }
    }
     
               
}
        


