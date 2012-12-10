
/**
 * Write a description of class Diagnosis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diagnosis
{
    private String name;
    private double prognosis;

    /**
     * Constructor for objects of class Diagnosis
     */
    public Diagnosis(String n, double p)
    {
        name = n;
        prognosis = p;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return name + ", " + "helbredelsesprognose:" + " " + prognosis; 
    }
    
    /**
     * 
     */
    public double getPrognosis()
    {
        return prognosis;
    }
    
}
