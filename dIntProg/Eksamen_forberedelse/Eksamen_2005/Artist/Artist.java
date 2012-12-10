
/**
 * Write a description of class Artist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Artist
{
    private String name;
    private String field;
    private String grade;
    private int price;

    /**
     * Constructor for objects of class Artist
     */
    public Artist(String n, String f, String g, int p)
    {
        name = n;
        field = f;
        grade = g;
        price = p;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return name + ", " + field + ", " + grade + ", " + price + " kr.";
    }
    
    /**
     * 
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * 
     */
    public String getGrade()
    {
        return grade;
    }
    
    /**
     * 
     */
    public String getName()
    {
        return name;
    }
    
    
}
