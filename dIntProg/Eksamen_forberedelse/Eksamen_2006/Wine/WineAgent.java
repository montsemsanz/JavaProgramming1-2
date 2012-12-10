import java.util.*;
/**
 * Write a description of class WineAgent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WineAgent
{
    private String name;
    private List<Wine> wines;

    /**
     * Constructor for objects of class WineAgent
     */
    public WineAgent(String n)
    {
        name = n;
        wines = new ArrayList<Wine>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(Wine w)
    {
        wines.add(w);
    }
    
    /**
     * 
     */
    public void remove(Wine w)
    {
        wines.remove(w);
    }
    
    /**
     * 
     */ 
     public List<Wine> wineWithGrade(int g)
     {
         List<Wine> result = new ArrayList<Wine>();
         for(Wine w : wines) {
             if(g <= w.getGrade()) {
                 result.add(w);
             }
         }
         return result;
     }
     
     /**
      * 
      */
     public Wine bestBuy()
     {
         Wine bestBuyYet = wines.get(0);
         for(Wine w : wines) {
             if(w.getGrade() > bestBuyYet.getGrade()) {
                 bestBuyYet = w;
             }
         } 
         return bestBuyYet;
     }
     
     /**
      * 
      */
     public void printWine()
     {
         Collections.sort(wines);
         for(Wine w : wines) {
             System.out.println(" " + w);
         }
     }
      
}
