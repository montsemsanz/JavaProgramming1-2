import java.util.*;
/**
 * Write a description of class YearComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YearComparator implements Comparator<Book>
{
    public int compare(Book b1, Book b2)
    {
        if(b1.getYear() != b2.getYear()) {
            return b1.getYear() - b2.getYear();
        }
        if(!b1.getAuthor().equals(b2.getAuthor())) {
            return b1.getAuthor().compareTo(b2.getAuthor());
        }
        return b1.getTitle().compareTo(b2.getTitle());
    }
}
