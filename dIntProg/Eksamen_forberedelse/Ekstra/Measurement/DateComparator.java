import java.util.*;
/**
 * Write a description of class DateComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DateComparator implements Comparator<Measurement>
{
    public int compare(Measurement m1, Measurement m2)
    {
        if(!m1.getDate().equals(m2.getDate())) {
            return m1.getDate().compareTo(m2.getDate());
        }
        if(!m1.getPlace().equals(m2.getPlace())) {
            return m1.getPlace().compareTo(m2.getPlace());
        }
        return m1.getTemp() - m2.getTemp();
    }
    
}
