import java.util.*;
/**
 * Write a description of class HourlyPaid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HourlyPaid
{
    private int salaryPerHour;
    private List<TimeSheet> timesheets;

    /**
     * Constructor for objects of class HourlyPaid
     */
    public HourlyPaid(int s)
    {
        salaryPerHour = s;
        timesheets = new ArrayList<TimeSheet>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void addTimeSheet(TimeSheet t)
    {
        timesheets.add(t);
    }
    
    /**
     * 
     */
    public void removeTimeSheet(TimeSheet t)
    {
        timesheets.remove(t);
    }    
    
    /**
     * 
     */
    public int calculateSalary()
    {
        int total = 0; 
        for(TimeSheet t : timesheets) {
            total = total + t.getNoOfHours();
        }
        return total * salaryPerHour;
    }
    
    /**
     * 
     */
    public void orderByHours()
    {
        Collections.sort(timesheets);
        for(TimeSheet t : timesheets) {
            System.out.println(t);
        }
       
    }
     
}    
     

