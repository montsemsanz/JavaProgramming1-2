import java.util.*;
/**
 * Write a description of class Allotment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Allotment
{
    private String address;
    private List<Plant> plants;

    /**
     * Constructor for objects of class Allotment
     */
    public Allotment(String a)
    {
        address = a;
        plants = new ArrayList();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void addPlant(Plant p)
    {
        plants.add(p);
    }
    
    /**
     * 
     */
    public void removePlant(Plant p)
    {
        plants.remove(p);
    }
    
    /**
     * 
     */
    public int totalValue()
    {
        int total = 0;
        for(Plant p : plants) {
            total = total + p.getValue();
        }
        return total;
    }
    
    /**
     * 
     */
    public Plant bestPlant()
    {
        Plant bestSoFar = plants.get(0);
        for(Plant p : plants) {
            if(p.getValue() > bestSoFar.getValue()) {
                bestSoFar = p;
            }
        }
        return bestSoFar;
    }
            
     
}
