import java.util.*;
/**
 * Write a description of class AreaComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AreaComparator implements Comparator<ScoutGroup>
{
    public int compare(ScoutGroup sg1, ScoutGroup sg2)
    {
        if(!sg1.getArea().equals(sg2.getArea())) {
            return sg1.getArea().compareTo(sg2.getArea());
        }
        else {
            return sg1.getMembers() - sg2.getMembers();
        }
    }
   
}
