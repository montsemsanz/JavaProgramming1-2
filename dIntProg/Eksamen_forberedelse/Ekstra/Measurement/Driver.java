
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
        Measurement m1 = new Measurement("2005-10-25", "Grenå", 18);
        Measurement m2 = new Measurement("2003-07-23", "Hadsten", 29);
        Measurement m3 = new Measurement("2005-10-25", "Grenå", 21);
        Measurement m4 = new Measurement("2003-07-23", "Århus", 22);
        Measurement m5 = new Measurement("2005-10-25", "Ebeltoft", 20);
        Measurement m6 = new Measurement("2003-07-23", "Århus", 25);
        Measurement m7 = new Measurement("2005-10-25", "Ebeltoft", 31);
        Measurement m8 = new Measurement("2003-07-23", "Hadsten", 24);
        Measurement m9 = new Measurement("2005-10-25", "Grenå", 23);
        Measurement m10 = new Measurement("2003-07-23", "Århus", 26);
        Measurement m11 = new Measurement("2005-10-25", "Ebeltoft", 27);
        Measurement m12 = new Measurement("2003-07-23", "Hadsten", 28);
        
        System.out.println(m1 + "\n" + m2);
        
        WheaterInfo wi = new WheaterInfo();
        wi.add(m1);
        wi.add(m2);
        wi.add(m3);
        wi.add(m4);
        wi.add(m5);
        wi.add(m6);
        wi.add(m7);
        wi.add(m8);
        wi.add(m9);
        wi.add(m10);
        wi.add(m11);
        wi.add(m12);
        
        System.out.println("Antal målinger med temperaturen 18 grader: " +
        "\n" + wi.noOfMeasurements(18));
        
        System.out.println("Liste over målinger fra Ebeltoft: " + "\n" + 
        wi.find("Ebeltoft"));
        
        System.out.println("Målinger ordnet efter dato, sted og temperatur: ");
        wi.printMeasurements();
        
    }
}
