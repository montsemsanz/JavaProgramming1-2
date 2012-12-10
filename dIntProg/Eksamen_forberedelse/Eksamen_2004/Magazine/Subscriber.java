import java.util.*;
/**
 * Write a description of class Subscriber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Subscriber
{
    private String name;
    private List<Magazine> magazines;

    /**
     * Constructor for objects of class Subscriber
     */
    public Subscriber(String n)
    {
        name = n;
        magazines = new ArrayList<Magazine>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void addMagazine(Magazine m)
    {
        magazines.add(m);
    }
    
    /**
     * 
     */
    public void removeMagazine(Magazine m)
    {
        magazines.remove(m);
    }
    
    /**
     * 
     */
    public int totalPrize()
    {
        int t = 0;
        for(Magazine m : magazines) {
            t = t + m.getPrize();
        }
        return t;
    }
    
    /**
     * 
     */
    public void listMagazines()
    {
        for(Magazine m : magazines) {
            System.out.println(m);
        }
        
        System.out.println("Total pris:");
        System.out.println(this.totalPrize());
    }
    
    /**
     * 
     */
    public void orderByName()
    {
        Collections.sort(magazines);
        for(Magazine m : magazines) {
            System.out.println(m);
        }
        
    }
}
