
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
        Book b7 = new Book("Randrup", "Taldjævelen", 1997, 7442);
        Book b8 = new Book("Tantholdt", "Undtagelsen", 2001, 3625);
        Book b9 = new Book("Olesen", "Taldjævelen", 1997, 7442);
        Book b10 = new Book("Møller", "Undtagelsen", 2001, 3625);
        Book b11 = new Book("Sarvig", "Taldjævelen", 1997, 7442);
        Book b12 = new Book("Hansen", "Undtagelsen", 2001, 3625);
        
//         System.out.println(b1 + "\n" + b2);
//         
        Publisher p = new Publisher("Gyldendahl");
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b11);
        p.add(b12);
        
        
//         System.out.println("Bestseller: " + p.bestseller());
//         
//         System.out.println("Total salg: " + p.totalSales());
//         
        System.out.println("Liste over bøger:");
        p.printBooks();
    }
        
}
