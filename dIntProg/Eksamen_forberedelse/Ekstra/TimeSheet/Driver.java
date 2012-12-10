
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
        TimeSheet t1 = new TimeSheet("fejlfinding på BS3000", 2);
        TimeSheet t2 = new TimeSheet("rekonfiguration af TR400", 3);
        
        System.out.println(t1 + "\n" + t2);
        
        HourlyPaid hp = new HourlyPaid(78);
        hp.addTimeSheet(t1);
        hp.addTimeSheet(t2);
        
        System.out.println("Timesedler ordnet efter antal timer og beskrivelse: ");
        hp.printTimeSheets();
 
    }
        
}
