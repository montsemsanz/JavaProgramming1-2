import java.util.*;
/**
 * Write a description of class ScoutGroup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoutGroup
{
    private List<Scout> scouts;
    private Scout leader;

    /**
     * Constructor for objects of class ScoutGroup
     */
    public ScoutGroup()
    {
        scouts = new ArrayList<Scout>();
        leader = null;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void setLeader(Scout s)
    {
         leader = s;
    }
    
    /**
     * 
     */
    public Scout getLeader()
    {
        return leader;
    }
    
    /**
     * 
     */
    public void add(Scout s)
    {
        scouts.add(s);
    }
    
    /**
     * 
     */
    public void remove(Scout s)
    {
        scouts.remove(s);
    }
     
    /**
     * 
     */
    public int totalMarks()
    {
        int total = 0;
        for(Scout s : scouts) {
            total = total + s.getMarks();
        }
        return total;
    }
    
    /**
     * 
     */
    public List<Scout> find(int threshold)
    {
        List<Scout> overThreshold = new ArrayList<Scout>();
        for(Scout s : scouts) {
            if(s.getMarks() >= threshold) {
                overThreshold.add(s);
            }
        }
        return overThreshold;
    }
    
    /**
     * 
     */
    public void printScouts()
    {
        Collections.sort(scouts);
        for(Scout s : scouts) {
            System.out.println(s);
        }
    }



}
