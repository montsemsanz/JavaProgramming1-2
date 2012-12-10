import java.util.*;
/**
 * Write a description of class GradeComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GradeComparator implements Comparator<Artist>
{
    public int compare(Artist a1, Artist a2)
    {
        if(a1.getGrade().equals(a2.getGrade())) {
            return a1.getName().compareTo(a2.getName());
        }
        return a1.getGrade().compareTo(a2.getGrade()); 
    }
   
    
}
