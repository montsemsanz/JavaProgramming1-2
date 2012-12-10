
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
        Measurement m1 = new Measurement("2005-10-25", "Ebeltoft", 18);
        Measurement m2 = new Measurement("2003-11-21", "Århus", 15);
        
        WeatherInfo w1 = new WeatherInfo();
        w1.add(m1);
        w1.add(m2);
        
        System.out.println("Antal målinger med 15 grader: " +
        w1.noOfMeasurements(15));
        
        System.out.println("Målinger fra Ebeltoft: " + w1.find("Ebeltoft"));
        
        w1.printMeasurements();
    }
        
        
}
