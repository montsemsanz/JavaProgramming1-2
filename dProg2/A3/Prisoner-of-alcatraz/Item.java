
/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item
{
    private String description;
    private int points;

    /**
     * Create an object of the class Item
     */
    public Item(String d, int p)
    {
         description = d;
         points = p;
    }

    /**
     * @Return a description of the item. 
     */
   public String getDescription()
    {
        return description;
    }
    
    /**
     * @Return the items weight. 
     */
    public int getPoints()
    {
        return points;
    }
}
