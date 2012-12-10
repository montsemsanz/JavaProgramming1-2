import java.util.*;
/**
 * Write a description of class SalesComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SalesComparator implements Comparator<Book>
{
    public int compare(Book b1, Book b2)
    {
        return b1.getSales() - b2.getSales();
    }
}
