import java.util.*;
/**
 * Write a description of class Politician here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Politician implements Comparable<Politician>
{
    private String name;
    private String party;
    private int votes;

    /**
     * Constructor for objects of class Politician
     */
    public Politician(String n, String p, int v)
    {
        name = n;
        party = p;
        votes = v;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return name + ", " + party + ", " + votes + " stemmer.";
    }
    
    /**
     * 
     */
    public String getParty()
    {
        return party;
    }
    
    /**
     * 
     */
    public int getVotes()
    {
        return votes;
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
    public int compareTo(Politician p)
    {
        if(!party.equals(p.getParty())) {
            return party.compareTo(p.getParty());
        }
        if(!name.equals(p.getName())) {
            return name.compareTo(p.getName());
        }
        return votes - p.getVotes();
    }
            
}
