import java.util.*;
/**
 * Write a description of class ValueComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ValueComparator implements Comparator<Painting>
{
   public int compare(Painting p1, Painting p2)
   {
       return p1.getValue() - p2.getValue();
   }
}
