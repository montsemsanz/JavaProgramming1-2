/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
public class Book
{
    // The author of the book.
    private String author;
    // The title of the book.
    private String title;
    // The number of pages in the book.
    private int pages;
    // The referencenumber for the book.
    private String refnumber;

    /**
     * Set the author, title and pages fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refnumber = " ";
    }

    /**
     * Print author.
     */
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    /**
     * Print title.
     */
    public void printTitle()
    {
        System.out.println(title);
    }    
    
    /**
     * Get number of pages.
     */
    public int getBookPages()
    {
        return pages;
    }
    
    /**
     * Print details.
     */ 
    public void printDetails()
    {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
        if (refnumber.length > 0) {
            System.out.println("Reference: " + refnumber);
        }
            else {
                System.out.println("Reference: " + "ZZZ");
        }
    
    /**
     * = reference number.
     */
    public void setRefNumber(String ref)
    {
        refnumber = ref;
    }
    
    /**
     * Get reference number.
     */
    public String getRefNumber()
    {
        return refnumber;
    }
    
 }    