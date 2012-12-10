
/**
 * Write a description of class SalesNote here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SalesNote
{
    private String date;
    private String description;
    private int amount;

    /**
     * Constructor for objects of class SalesNote
     */
    public SalesNote(String da, String de, int a)
    {
        date = da;
        description = de;
        amount = a;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return date + ", " + description + ", " + amount + " kr.";
    }
    
    /**
     * 
     */
    public int getAmount()
    {
        return amount;
    }
    
    /**
     * 
     */
    public String getDate()
    {
        return date;
    }
}
