import java.util.*;
/**
 * Write a description of class GameComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameComparator implements Comparator<Game>
{
    public int compare(Game g1, Game g2)
    {
        if(g1.getTotalScore() == g2.getTotalScore()) {
            return g1.getHomeScore() - g2.getHomeScore();
        }
        return g1.getTotalScore() - g2.getTotalScore();
    }
    
}
