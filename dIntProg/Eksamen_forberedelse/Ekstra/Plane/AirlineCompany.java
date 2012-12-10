import java.util.*;
/**
 * Write a description of class AirlineCompany here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AirlineCompany
{
    private String name;
    private List<Plane> planes;

    /**
     * Constructor for objects of class AirlineCompany
     */
    public AirlineCompany(String n)
    {
        name = n;
        planes = new ArrayList<Plane>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(Plane p)
    {
        planes.add(p);
    }
    
    /**
     * 
     */
    public void remove(Plane p)
    {
        planes.remove(p);
    }
    
    /**
     * 
     */
    public List<Plane> select(int low, int high)
    {
        List<Plane> result = new ArrayList<Plane>();
        for(Plane p : planes) {
            if((low < p.getCapacity()) && (p.getCapacity() < high)) {
                result.add(p);
            }
        }
        return result;
    }
    
    /**
     * 
     */
    public Plane widestRange()
    {
        Plane widestRangeYet = planes.get(0);
        for(Plane p : planes) {
            if(p.getRange() > widestRangeYet.getRange()) {
                p = widestRangeYet;
            }
        }
        return widestRangeYet;
    }
    
    /**
     * 
     */
    public void printPlanes()
    {
        Collections.sort(planes);
        for(Plane p : planes) {
            System.out.println(" " + p);
        }
    }
}
