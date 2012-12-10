import java.util.*;
/**
 * Write a description of class SalaryComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SalaryComparator implements Comparator<Actor>
{
    public int compare(Actor a1, Actor a2)
    {
        if(a1.getSeniority() == a2.getSeniority()) {
            return a1.getSalary() - a2.getSalary();
        }
        return a1.getSeniority() - a2.getSeniority();
    }
}
