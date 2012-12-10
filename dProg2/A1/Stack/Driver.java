import java.util.*;
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver 
{
    public static void run1()
    {
        Klient k = new Klient();   
        System.out.println("Spejlvending af en talrække: " + "\n" +
        k.spejlvendeHeltal());
        
    }
    
    public static void run2()
    {
        Klient k = new Klient();
        System.out.println("Spejlvending af en række strenge: " + "\n" +
        k.spejlvendeStrenge());
    }
}
