import java.util.*;
/**
 * Write a description of class PartyComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PartyComparator implements Comparator<Politician>
{
    public int compare(Politician p1, Politician p2)
    {
        if(!p1.getParty().equals(p2.getParty())) {
            return p1.getParty().compareTo(p2.getParty());
        }
        if(!p1.getName().equals(p2.getName())) {
            return p1.getName().compareTo(p2.getName());
        }
        return p1.getVotes() - p2.getVotes();
    }
}
