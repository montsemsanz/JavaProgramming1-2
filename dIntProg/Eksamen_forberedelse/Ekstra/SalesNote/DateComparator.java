import java.util.*;
/**
 * Write a description of class DateComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DateComparator implements Comparator<SalesNote>
{
    public int compare(SalesNote sn1, SalesNote sn2)
    {
        if(sn1.getDate().equals(sn2.getDate())) {
            return sn1.getAmount() - sn2.getAmount();
        }
        return sn1.getDate().compareTo(sn2.getDate());
    }
}

