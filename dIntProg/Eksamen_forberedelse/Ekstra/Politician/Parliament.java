import java.util.*;
/**
 * Write a description of class Parliament here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parliament
{
    private String name;
    private List<Politician> politicians;
    /**
     * Constructor for objects of class Parliament
     */
    public Parliament(String n)
    {
        name = n;
        politicians = new ArrayList<Politician>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(Politician p)
    {
        politicians.add(p);
    }
    
    /**
     * 
     */
    public void remove(Politician p)
    {
        politicians.remove(p);
    }
    
    /**
     * 
     */
    public int noOfPoliticians(String party)
    {
        int total = 0;
        for(Politician p : politicians) {
            if(party.equals(p.getParty())) {
                total = total + 1;
            }
        }
        return total;
    }
    
    /**
     * 
     */
    public List<Politician> find(int threshold)
    {
        List<Politician> result = new ArrayList<Politician>();
        for(Politician p : politicians) {
            if(threshold < p.getVotes()) {
                result.add(p);
            }
        }
        return result;
    }
    
    /**
     * 
     */
    public void printPoliticians()
    {
        Collections.sort(politicians);
        for(Politician p : politicians) {
            System.out.println(" " + p);
        }
    }
            
}
