import java.util.*;
/**
 * Write a description of class WeatherInfo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WeatherInfo
{
    private List<Measurement> measurements;

    /**
     * Constructor for objects of class WeatherInfo
     */
    public WeatherInfo()
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
        List<Measurement> certainPlace = new ArrayList<Measurement>();
        for(Measurement m : measurements) {
            if(place == m.getPlace()) {
                certainPlace.add(m);
            }
        }
        return certainPlace;
    }
    
    /**
     * 
     */
    public void printMeasurements()
    {
        Collections.sort(measurements);
        for(Measurement m : measurements) {
            System.out.println(m);
        }
    }
     
}
