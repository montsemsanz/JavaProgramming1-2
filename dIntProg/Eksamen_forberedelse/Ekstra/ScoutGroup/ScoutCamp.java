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
    private List<ScoutGroup> groups;

    /**
     * Constructor for objects of class ScoutCamp
     */
    public ScoutCamp(String n)
    {
        name = n;
        groups = new ArrayList<ScoutGroup>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(ScoutGroup sg)
    {
        groups.add(sg);
    }
    
    /**
     * 
     */
    public void remove(ScoutGroup sg)
    {
        groups.remove(sg);
    }
    
    /**
     * 
     */
    public int noOfScoutGroups(String area)
    {
        int total = 0;
        for(ScoutGroup sg : groups) {
            if(area.equals(sg.getArea())) {
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
        List<ScoutGroup> result = new ArrayList<ScoutGroup>();
        for(ScoutGroup sg : groups) {
            if(area.equals(sg.getArea())) {
                result.add(sg);
            }
        }
        return result;
    }
    
    /**
     * 
     */
    public void printScoutGroups()
    {
        Collections.sort(groups, new AreaComparator());
        for(ScoutGroup sg : groups) {
            System.out.println(" " + sg);
        }
    }
        
            
}
