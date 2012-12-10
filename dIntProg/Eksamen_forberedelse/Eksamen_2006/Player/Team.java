import java.util.*;
/**
 * Write a description of class Team here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Team
{
    private String name;
    private List<Player> players;
    /**
     * Constructor for objects of class Team
     */
    public Team(String n)
    {
        name = n;
        players = new ArrayList<Player>();
        
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(Player p)
    {
        players.add(p);
    }
    
    /**
     * 
     */
    public void remove(Player p)
    {
        players.remove(p);
    }
    
    /**
     * 
     */
    public List<Player> selectByPrice(int p)
    {
        List<Player> result = new ArrayList<Player>();
        for(Player q : players) {
            if(q.getPrice() >= p) {
                result.add(q);
            }
        }
        return result;
    }
    
    /**
     * 
     */
    public Player bestInvestment()
    {
        return Collections.max(players, new InvestmentComparator());
    }
    
    /**
     * 
     */
    public void printPlayers()
    {
        Collections.sort(players, new InvestmentComparator());
        for(Player p : players) {
            System.out.println(" " + p);
        }
    }
        
}
