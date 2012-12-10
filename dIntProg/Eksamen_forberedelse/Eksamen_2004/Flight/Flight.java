import java.util.*;
/**
 * Write a description of class Flight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flight
{
    private String flightNumber;
    private String departure;
    private String destination;
    private int totalLoadCapacity;
    private List<Lugage> lugages;

    /**
     * Constructor for objects of class Flight
     */
    public Flight(String fN, String dep, String des, int tLC)
    {
        flightNumber = fN;
        departure = dep;
        destination = des;
        totalLoadCapacity = tLC;
        lugages = new ArrayList<Lugage>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
       return flightNumber + ": " + departure + " - " + destination + 
       " (C: " + totalLoadCapacity + " kg; A: " + this.availableLoadCapacity() + ") ";
    }
    
    /**
     * 
     */
    public void addLugage(Lugage l)
    {
        if(l.getWeight() <= availableLoadCapacity()) {
            lugages.add(l);
        }
        else {
            System.out.println("Total Load Capacity exceeded");
        }    
    }
    
    /**
     * 
     */
    public void removeLugage(Lugage l)
    {
        lugages.remove(l);
    }
    
    /**
     * 
     */
    public int availableLoadCapacity()
    {
        int u = 0;
        for(Lugage l : lugages) {
            u = u + l.getWeight();
        }
        return totalLoadCapacity - u;
    }    
        
    
}
