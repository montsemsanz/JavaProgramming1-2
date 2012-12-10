import java.util.HashMap;
/**
 * Write a description of class MapTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MapTester
{
    // Storage for an arbitrary number of names and phonenumbers.
    private HashMap<String, String> phoneBook;

    /**
     * Create a phoneBook with a list of names and phonenumbers.
     */
    public MapTester() {
        phoneBook = new HashMap<String, String>();
    }

    /**
     * insert a name and a phonenumber into the list.
     */ 
    public void enterNumber(String name, String number) {
        phoneBook.put(name, number);
    }
    
    /**
     * retrieve a name and a phonenumber from the list.
     */
    public String lookUpNumber(String name) {
        return phoneBook.get(name);
    }
}    