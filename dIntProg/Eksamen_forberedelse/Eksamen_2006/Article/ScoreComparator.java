import java.util.*;
/**
 * Write a description of class ScoreComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreComparator implements Comparator<Article>
{
    public int compare(Article a1, Article a2)
    {
        return a1.getPoints() - a2.getPoints();
    }
  
}
