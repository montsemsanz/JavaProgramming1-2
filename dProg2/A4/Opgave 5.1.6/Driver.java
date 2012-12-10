
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
        Subscription s = new Subscription("28465432");
        
        System.out.println("Tjek instantiering: " + s.getBalance());
                
        Transaction t1 = new Call(15, "45634690");
        Transaction t2 = new SMS(1, "27384645", "Hej");
        Transaction t3 = new Payment(150);
        
        s.addTransaction(t1);
        s.addTransaction(t2);
        s.addTransaction(t3);
        
        System.out.println("Tjek, at add metoden ændrer balance: " + s.getBalance());
        
        System.out.println("Tjek, at toString repræsentationen er korrekt: ");
        System.out.println(s.toString());
        System.out.println();
        
        System.out.println("Udskriv liste over alle transaktioner: ");
        s.printActivityList();
    }
        
}
