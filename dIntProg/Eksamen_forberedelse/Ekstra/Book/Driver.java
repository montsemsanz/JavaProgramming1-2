
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
        Book b1 = new Book("Enzenberger", "Taldjævlen", 1997, 7442);
        Book b2 = new Book("Jungersen", "Undtagelsen", 2000, 8365);
        Book b3 = new Book("Hansen", "Taldjævlen", 1997, 7442);
        Book b4 = new Book("Jensen", "Undtagelsen", 2000, 8365);
        Book b5 = new Book("Enzenberger", "Ungarn", 1997, 7442);
        Book b6 = new Book("Jungersen", "Spanien", 2000, 8365);
        Book b7 = new Book("Jungersen", "Argentina", 2000, 8365);

        System.out.println(b1 + "\n" + b2);
        
        Publisher p = new Publisher("Gyldendahl");
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        
        System.out.println("Antal bøger på listen: " + "\n" + 
        p.getSize());
        
        System.out.println("Gyldendahls bestseller: " + "\n" +
        p.bestseller());
        
        System.out.println("Gyldendahls totale salg: " + "\n" +
        p.totalSales());
        
        System.out.println("Bøger ordnet efter år, forfatter og titel: ");
        p.printBooks();
    }
        
}
