
/**
 * Write a description of class SMS here.
 * Amount er statik, fordi ydelsens pris er fastsat en gang for alle?
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SMS extends Transaction
{
    // instance variables - replace the example below with your own
    private String recipient;
    private String message;

    /**
     * Opret et objekt af klassen SMS
     */
    public SMS(int a, String r, String m)
    {
        super(a);
        recipient = r;
        message = m;
    }
    
    /**
     * Etabler en String repræsentation af objektet.
     */
    public String toString()
    {
        return "SMS: " + amount + " kr.";
    }
}
