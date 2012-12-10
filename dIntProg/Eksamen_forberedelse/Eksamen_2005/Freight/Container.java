import java.util.*;
/**
 * Write a description of class Container here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Container
{
    private String id;
    private int volumeCapacity;
    private List<Freight> freights;

    /**
     * Constructor for objects of class Container
     */
    public Container(String id, int vC)
    {
        this.id = id;
        volumeCapacity = vC;
        freights = new ArrayList<Freight>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(Freight f)
    {
        if(f.getVolume() <= this.remainingSpace()) {
            freights.add(f);
        }
        else {
            System.out.println("Volume capacity exceeded");
        }
    }
    
    /**
     * 
     */
    public void remove(Freight f)
    {
        freights.remove(f);
    }
        
    /**
     * 
     */
    public Freight largestFreight()
    {
        Freight largestFreightYet = freights.get(0);
        for(Freight f : freights) {
            if(f.getVolume() > largestFreightYet.getVolume()) {
                largestFreightYet = f;
            }
        }
        return largestFreightYet;
    }
    
    /**
     * 
     */
    public int remainingSpace()
    {
        int total = 0;
        for(Freight f : freights) {
            total = total + f.getVolume();
        }
        return volumeCapacity - total;
    }
    
    /**
     * 
     */
    public void printFreight()
    {
        Collections.sort(freights);
        for(Freight f : freights) {
            System.out.println(" " + f);
        }
    }
}
