import java.util.*;
/**
 * Write a description of class ValueComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ValueComparator implements Comparator<Instrument>
{
    public int compare(Instrument i1, Instrument i2)
    {
        return i1.getValue() - i2.getValue();
    }
}
