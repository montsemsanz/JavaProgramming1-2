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
     * Creates object of type AirlineCompany
     */
    public AirlineCompany(String n)
    {
        name = n;
        planes = new ArrayList<Plane>();
    }

    /**
     * Adds a plane to AirlineCompany
     * @param p The Plane to be added     
     */
    public void add(Plane p)
    {
        planes.add(p);
    }
    
    /**
     * Removes a Plane from AirlineCompany
     * @ param p The Plane to be removed    
     */
    public void remove(Plane p)
    {
        planes.remove(p);
    }
    
    /**
     * Returns a list of planes with capacity in certain range
     * @param low The minimum capacity of plane
     * @param high The maximum capacity of plane
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
     * Returns the planes with the widest range
     */
    public Plane widestRange()
    {
        Plane widestRangeYet = planes.get(0);
        for(Plane p : planes) {
            if(p.getRange() > widestRangeYet.getRange()) {
                widestRangeYet = p;
            }
        }
        return widestRangeYet;
    }
    
    /**
     * Prints a list of planes
     */
    public void printPlanes()
    {
        Collections.sort(planes);
        for(Plane p : planes) {
            System.out.println(" " + p);
        }
    }
       
}
