
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
        Subscription s = new Subscription("32428465");
        
        System.out.println("Tjek, at konstruktøren indsætter 200 kr.: ");
        System.out.println(s.getBalance());
        
        Transaction t1 = new Call(15, "52389465");
        Transaction t2 = new SMS("23864703", "Hej");
        s.add(t1);
        s.add(t2);
        
        System.out.println("Liste over aktiviteten på kontoen: ");
        s.printActivityList();
        
        System.out.println("Status efter de to første transaktioner: " +
        s.getBalance());
        
        Transaction t3 = new Payment(150);
        s.add(t3);
        
        System.out.println("Status efter den sidste transaktion: ");
        System.out.println(s.getBalance());
        System.out.println();
        
        
    }
        
}
