
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{
    private String home, away;
    private int homeScore;
    private int awayScore;

    /**
     * Constructor for objects of class Game
     */
    public Game(String h, String a, int hS, int aS)
    {
        home = h;
        away = a;
        homeScore = hS;
        awayScore = aS;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return home + " - " + away + ", " + homeScore + " - " + awayScore;
    }
    
    /**
     * 
     */
    public int getTotalScore()
    {
        return homeScore + awayScore;
    }
    
    /**
     * 
     */
    public int getHomeScore()
    {
        return homeScore;
    }
    
}