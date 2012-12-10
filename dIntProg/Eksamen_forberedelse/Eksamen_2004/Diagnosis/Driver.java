
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    public static void exam()
    {
        Diagnosis d1 = new Diagnosis("Lungekræft", 0.52);
        Diagnosis d2 = new Diagnosis("Halsbetændelse", 0.78);
        Diagnosis d3 = new Diagnosis("Blodprop", 0.23);
        
        System.out.println(d1 + "\n" + d2 + "\n" + d3);
        
        Person p1 = new Person();
        p1.addDiagnosis(d1);
        p1.addDiagnosis(d2);
        p1.addDiagnosis(d3);
        
        System.out.println(p1.totalPrognosis());
    }
}