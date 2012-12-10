import java.util.*;
/**
 * Write a description of class Ensemble here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ensemble
{
    private String name;
    private List<Actor> actors;
    /**
     * Constructor for objects of class Ensemble
     */
    public Ensemble(String n)
    {
        name = n;
        actors = new ArrayList<Actor>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(Actor a)
    {
        actors.add(a);    
    }
    
    /**
     * 
     */
    public void remove(Actor a)
    {
        actors.remove(a);
    }
    
    /**
     * 
     */
    public int averageSeniority()
    {
        int total = 0;
        for(Actor a : actors) {
            total = total + a.getSeniority();
        }
        return total / actors.size();
    }
    
    /**
     * 
     */
    public Actor mostSeniorActor()
    {
        return Collections.max(actors, new SeniorityComparator());
    }
    
    /**
     * 
     */
    public void printActors()
    {
        Collections.sort(actors, new SalaryComparator());
        for(Actor a : actors) {
            System.out.println(" " + a);
        }
    }  
}
