import java.util.*;
/**
 * Write a description of class InvestmentComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InvestmentComparator implements Comparator<Player>
{
    public int compare(Player p1, Player p2)
    {
        if(p1.getInvestment() < p2.getInvestment()) {
            return -1;
        }
        if(p1.getInvestment() > p2.getInvestment()) {
            return 1;
        }
        return 0;
    }
}
