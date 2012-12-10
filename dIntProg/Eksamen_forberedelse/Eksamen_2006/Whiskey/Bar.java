import java.util.*;
/**
 * Write a description of class Bar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bar
{
    private String name;
    private List<Whiskey> whiskeys;

    /**
     * Constructor for objects of class Bar
     */
    public Bar(String n)
    {
        name = n;
        whiskeys = new ArrayList<Whiskey>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(Whiskey w)
    {
        whiskeys.add(w);
    }
    
    /**
     * 
     */
    public void remove(Whiskey w)
    {
        whiskeys.remove(w);
    }
    
    /**
     * 
     */
    public List<Whiskey> whiskeyWithGrade(int g)
    {
        List<Whiskey> result = new ArrayList<Whiskey>();
        for(Whiskey w : whiskeys) {
            if(g <= w.getGrade()) {
                result.add(w);
            }
        }
        return result;
    }
    
    /**
     * 
     */ 
     public Whiskey bestBuy()
     {
         Whiskey bestBuyYet = whiskeys.get(0);
         for(Whiskey w : whiskeys) {
             if(bestBuyYet.getRatio() < w.getRatio()) {
                 bestBuyYet = w;
             }
         }
         return bestBuyYet;
     }
     
     /**
      * 
      */ 
      public void printWhiskey()
      {
          Collections.sort(whiskeys);
          for(Whiskey w : whiskeys) {
              System.out.println(" " + w);
          }
      }

}
