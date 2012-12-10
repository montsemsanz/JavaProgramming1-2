
/**
 * Write a description of class Actor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Actor
{
    private String name;
    private int salary;
    private int seniority;

    /**
     * Constructor for objects of class Actor
     */
    public Actor(String n, int sa, int se)
    {
        name = n;
        salary = sa;
        seniority = se;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return name + ", " + salary + ", " + seniority;
    }
    
    /**
     * 
     */
    public int getSeniority()
    {
        return seniority;
    }
    
    /**
     * 
     */
    public int getSalary()
    {
        return salary;
    }
}
