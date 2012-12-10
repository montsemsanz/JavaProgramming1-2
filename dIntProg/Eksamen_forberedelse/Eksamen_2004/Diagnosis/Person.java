import java.util.*;
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    private List<Diagnosis> medicalHistory;

    /**
     * Constructor for objects of class Person
     */
    public Person()
    {
        medicalHistory = new ArrayList();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void addDiagnosis(Diagnosis d)
    {
        medicalHistory.add(d);
    }
    
    /**
     * 
     */
    public void removeDiagnosis(Diagnosis d)
    {
        medicalHistory.remove(d);
    }
    
    /**
     * 
     */
    public double totalPrognosis()
    {
        double t = 1.00;
        for(Diagnosis d : medicalHistory) {
            t = t * d.getPrognosis(); 
        }
        return t;
    }
    
    /**
     * 
     */
    public Diagnosis bestPrognosis()
    {
        Diagnosis bestSoFar = medicalHistory.get(0);
        for(Diagnosis d : medicalHistory) {
            if(d.getPrognosis() > bestSoFar.getPrognosis()) {
                bestSoFar = d;
            }
        }
        return bestSoFar;
    }
        
}
