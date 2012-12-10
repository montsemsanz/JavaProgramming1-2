import java.util.*;
/**
 * Write a description of class WheaterInfo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WheaterInfo
{
    private List<Measurement> measurements;

    /**
     * Constructor for objects of class WheaterInfo
     */
    public WheaterInfo()
    {
        measurements = new ArrayList<Measurement>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(Measurement m)
    {
        measurements.add(m);
    }
    
    /**
     * 
     */
    public void remove(Measurement m)
    {
        measurements.remove(m);
    }
    
    /**
     * 
     */
    public int noOfMeasurements(int temp)
    {
        int total = 0;
        for(Measurement m : measurements) {
            if(temp == m.getTemp()) {
                total = total + 1;
            }
        }
        return total;
    }
    
    /**
     * 
     */
    public List<Measurement> find(String place)
    {
        List<Measurement> result = new ArrayList<Measurement>();
        for(Measurement m : measurements) {
            if(place.equals(m.getPlace())) {
                result.add(m);
            }
        }
        return result;
    }
    
    /**
     * 
     */
    public void printMeasurements()
    {
        Collections.sort(measurements, new DateComparator());
        for(Measurement m : measurements) {
            System.out.println(" " + m);
        }
    }
}
