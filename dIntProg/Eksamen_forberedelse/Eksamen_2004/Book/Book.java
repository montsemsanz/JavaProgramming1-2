
/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book 
{
    private String author;
    private String title;
    private int year;
    private int sales;

    /**
     * Constructor for objects of class Book
     */
    public Book(String a, String t, int y, int s)
    {
        author = a;
        title = t;
        year = y;
        sales = s;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public String toString()
    {
        return author + ", " + title + ", " + "(" + year + "), " +
        sales + " stk.";
    }
    
    /**
     * 
     */
    public int getSales()
    {
        return sales;
    }
    
    /**
     * 
     */
    public int getYear()
    {
        return year;
    }
    
    /**
     * 
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * 
     */
    public String getTitle()
    {
        return title;
    }
    
     
     
}
