import java.util.*;
/**
 * Write a description of class Journal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Journal
{
    private String name;
    private List<Article> articles; 

    /**
     * Constructor for objects of class Journal
     */
    public Journal(String n)
    {
        name = n;
        articles = new ArrayList<Article>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(Article a)
    {
        articles.add(a);
    }
    
    /**
     * 
     */
    public void remove(Article a)
    {
        articles.remove(a);
    }
    
    /**
     * 
     */
    public List<Article> selectByAuthor(String s)
    {
        List<Article> result = new ArrayList<Article>();
        for(Article a : articles) {
            if(a.getName().equals(s)) {
                result.add(a);
            }
        }
        return result;
    }
    
    /**
     * 
     */
    public Article highScoreArticle()
    {
        return Collections.max(articles, new ScoreComparator());
    }
                
    /**
     * 
     */
    public void printArticles()
    {
        Collections.sort(articles, new PrintComparator());
        for(Article a : articles) {
            System.out.println(" " + a);
        }
    }
    
}
