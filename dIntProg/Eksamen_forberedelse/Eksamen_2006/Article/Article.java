
/**
 * Write a description of class Article here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Article
{
    private String name;
    private String title;
    private int score;

    /**
     * Constructor for objects of class Article
     */
    public Article(String n, String t, int s)
    {
        name = n;
        title = t;
        score = s;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return name + ", " + title + ", " + score;
    }
    
    /**
     * 
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * 
     */
    public int getPoints()
    {
        return score;
    }
}
