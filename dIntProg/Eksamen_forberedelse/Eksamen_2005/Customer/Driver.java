
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
        Customer c1 = new Customer("Bo Boesen", "Boligby", 270);
        Customer c2 = new Customer("Anna Andersen", "Andeby", 540);
        Customer c3 = new Customer("Bent Betjent", "Boligby", 345);
        Customer c4 = new Customer("Bo Boesen", "Boligby", 271);
        Customer c5 = new Customer("Anna Andersen", "Andeby", 545);
        Customer c6 = new Customer("Bent Betjent", "Odense", 445);
        
        
//         System.out.println(c1 + "\n" + c2);
//         
        Company co = new Company("Ikea");
        co.add(c1);
        co.add(c2);
        co.add(c3);
        co.add(c4);
        co.add(c5);
        co.add(c6);
        
        
//         System.out.println("Antal kunder i Boligby: " + 
//         co.noOfCustomers("Boligby"));
//         
//         System.out.println(co.find(300));

       co.printCustomers();
            

    }
        
}
