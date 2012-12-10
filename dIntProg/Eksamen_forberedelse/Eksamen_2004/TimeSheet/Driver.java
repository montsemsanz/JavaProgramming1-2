
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
        TimeSheet t1 = new TimeSheet("Fejlfinding på BS3000", 2);
        TimeSheet t2 = new TimeSheet("Korrektion af koordinater", 3);
        TimeSheet t3 = new TimeSheet("Implementering af styresystem", 3);
        TimeSheet t4 = new TimeSheet("Irrelevant", 3);
//         
//         System.out.println(t1 + "\n" + t2);
//         
        HourlyPaid h1 = new HourlyPaid(105);
        h1.addTimeSheet(t1);
        h1.addTimeSheet(t2);
        h1.addTimeSheet(t3);
        h1.addTimeSheet(t4);
        
        
//         System.out.println("Samlede løn: " + h1.calculateSalary() + " kr.");
//         
        h1.orderByHours();
    
        
    }
    
}
