import java.util.*;
/**
 * Write a description of class PrintComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrintComparator implements Comparator<Article>
{
    public int compare(Article a1, Article a2)
    {
        if(a1.getPoints() == a2.getPoints()) {
            return a1.getName().compareTo(a2.getName());
        }
        return a1.getPoints() - a2.getPoints();
    }
   
}
