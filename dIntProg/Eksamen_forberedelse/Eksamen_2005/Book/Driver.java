
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
        
        Book b1 = new Book("Enzenberger", "Taldjævelen", 1997, 7442);
        Book b2 = new Book("Danielsen", "Undtagelsen", 2001, 3625);
        Book b3 = new Book("Andersen", "Taldjævelen", 1997, 7442);
        Book b4 = new Book("Andresen", "Undtagelsen", 2001, 3625);
        Book b5 = new Book("Thomsen", "Taldjævelen", 1997, 7442);
        Book b6 = new Book("Tofte", "Undtagelsen", 2001, 3625);
        
//         System.out.println(b1 + "\n" + b2);
//         
        Publisher p = new Publisher("Gyldendahl");
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        
        
//         System.out.println("Bestseller: " + p.bestseller());
//         
//         System.out.println("Total salg: " + p.totalSales());
//         
        System.out.println("Liste over bøger:");
        p.printBooks();
    }
        
}
