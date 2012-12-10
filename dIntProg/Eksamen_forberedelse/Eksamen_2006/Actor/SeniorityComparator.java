import java.util.*;
/**
 * Write a description of class SeniorityComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SeniorityComparator implements Comparator<Actor>
{
    public int compare(Actor a1, Actor a2)
    {
        return a1.getSeniority() - a2.getSeniority();
    }
}
