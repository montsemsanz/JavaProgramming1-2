import java.util.*;
/**
 * Write a description of class Pub here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pub
{
    private String name;
    private List<Beer> beers;

    /**
     * Constructor for objects of class Pub
     */
    public Pub(String n)
    {
        name = n;
        beers = new ArrayList<Beer>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(Beer b)
    {
        beers.add(b);
    }
    
    /**
     * 
     */
    public void remove(Beer b)
    {
        beers.remove(b);
    }
    
    /**
     * 
     */
    public int beerWithVolume(int v1, int v2)
    {
        int total = 0;
        for(Beer b : beers) {
            if((v1 < b.getVolume()) && (b.getVolume() < v2)) { 
                total = total + 1;
            }
        }
        return total;
     
    }
    
    /**
     * 
     */
    public Beer bestBuy()
    {
        Beer bestBuyYet = beers.get(0);
        for(Beer b : beers) {
            if(b.getRatio() > bestBuyYet.getRatio()) {
                bestBuyYet = b;
            }
        }
        return bestBuyYet;
    }
    
    /**
     * 
     */
    public void printBeers()
    {
        Collections.sort(beers);
        for(Beer b : beers) {
            System.out.println(" " + b);
        }
    }

}
