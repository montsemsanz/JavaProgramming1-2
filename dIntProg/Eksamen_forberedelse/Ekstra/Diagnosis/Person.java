import java.util.*;
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    private List<Diagnosis> sygdomme;

    /**
     * Constructor for objects of class Person
     */
    public Person()
    {
        sygdomme = new ArrayList<Diagnosis>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void addDiagnosis(Diagnosis d)
    {
        sygdomme.add(d);
    }
    
    /**
     * 
     */
    public void removeDiagnosis(Diagnosis d)
    {
        sygdomme.remove(d);
    }
    
    /**
     * 
     */
    public double totalPrognosis()
    {
        double total = 1.00;
        for(Diagnosis d : sygdomme) {
            total = total * d.getPrognosis();
        }
        return total;
    }
    
    /**
     * 
     */
    public Diagnosis bestPrognosis()
    {
        Diagnosis bestPrognosisYet = sygdomme.get(0);
        for(Diagnosis d : sygdomme) {
            if(d.getPrognosis() > bestPrognosisYet.getPrognosis()) {
                bestPrognosisYet = d;
            }
        }
        return bestPrognosisYet;
    }
}
