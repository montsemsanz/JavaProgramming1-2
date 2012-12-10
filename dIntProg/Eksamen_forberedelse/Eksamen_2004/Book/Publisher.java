import java.util.*;
/**
 * Write a description of class Publisher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Publisher
{
    private String name;
    private List<Book> books;

    /**
     * Constructor for objects of class Publisher
     */
    public Publisher(String n)
    {
        name = n;
        books = new ArrayList<Book>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(Book b)
    {
        books.add(b);
    }
    
    /**
     * 
     */
    public void remove(Book b)
    {
        books.remove(b);
    }
    
    /**
     * 
     */
    public Book bestseller()
    {
        Book bestsellerSoFar = books.get(0);
        for(Book b : books) {
            if(b.getSales() > bestsellerSoFar.getSales()) {
                bestsellerSoFar = b;
            }
        }
        return bestsellerSoFar;
    }
    
    /**
     * 
     */
    public int totalSales()
    {
        int total = 0;
        for(Book b : books) {
            total = total + b.getSales();
        }
        return total;
    }
     
    /**
     * 
     */
    public void printBooks()
    {
        Collections.sort(books, new YearComparator());
        for(Book b : books) {
            System.out.println(" " + b);
        }
    }
     

}
