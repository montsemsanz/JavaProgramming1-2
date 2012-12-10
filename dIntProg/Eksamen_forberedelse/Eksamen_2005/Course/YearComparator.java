import java.util.*;
/**
 * Write a description of class YearComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YearComparator implements Comparator<Course>
{
    public int compare(Course c1, Course c2)
    {
        if(c1.getYear().equals(c2.getYear())) {
            return c1.getQuarter().compareTo(c2.getQuarter());
        }
        return c1.getYear().compareTo(c2.getYear());
    }
}
