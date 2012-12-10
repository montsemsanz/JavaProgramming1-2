import java.util.*;
/**
 * Write a description of class Tournament here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tournament
{
    private String name;
    private List<Game> games;
    /**
     * Constructor for objects of class Tournament
     */
    public Tournament(String n)
    {
        name = n;
        games = new ArrayList<Game>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(Game g)
    {
        games.add(g);
    }
    
    /**
     * 
     */
    public void remove(Game g)
    {
        games.remove(g);
    }
    
    /**
     * 
     */
    public Game mostEntertaining()
    {
        Game mostEntertainingYet = games.get(0);
        for(Game g : games) {
            if(g.getTotalScore() > mostEntertainingYet.getTotalScore()) {
                mostEntertainingYet = g;
            }
        }
        return mostEntertainingYet;
    }
    
    /**
     * 
     */
    public int totalScores()
    {
        int total = 0;
        for(Game g : games) {
            total = total + g.getTotalScore();
        }
        return total;
    }
    
    /**
     * 
     */
    public void printGames()
    {
        Collections.sort(games, new GameComparator());
        for(Game g : games) {
            System.out.println(" " + g);
        }
    }
}