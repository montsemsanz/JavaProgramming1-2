
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
        Diagnosis d2 = new Diagnosis("Tuberkulose", 0.38);
        Diagnosis d3 = new Diagnosis("Halsbetændelse", 0.72);
        
        System.out.println(d1 + "\n" + d2 + "\n" + d3);
        
        Person p = new Person();
        p.addDiagnosis(d1);
        p.addDiagnosis(d2);
        p.addDiagnosis(d3);
        
        System.out.println("Den totale prognose for patienten: " + "\n" +
        " " + p.totalPrognosis());
        
        System.out.println("Den bedste prognose for patienten: " + "\n" + 
        " " + p.bestPrognosis());
    }
        
}
