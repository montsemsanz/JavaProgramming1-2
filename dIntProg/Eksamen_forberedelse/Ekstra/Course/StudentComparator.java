import java.util.*;
/**
 * Write a description of class StudentComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentComparator implements Comparator<Course>
{
    public int compare(Course c1, Course c2)
    {
        return c1.getNoOfStudents() - c2.getNoOfStudents();
    }
    
}
