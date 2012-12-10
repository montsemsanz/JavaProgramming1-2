
/**
 * Write a description of class SMS here.
 * Amount er static, fordi ydelsens pris er fastsat en gang for alle?
 * 
 * @author Susie
 * @version 28.11.07
 */
public class SMS implements Transaction
{
    private static int amount;
    private String recipient;
    private String message;

    /**
     * Opret et objekt af klassen SMS
     */
    public SMS(String r, String m)
    {
        amount = 1;       
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
    
    /**
     * Returner omkostningen ved SMS-forsendelsen.
     */
    public int getAmount()
    {
        return -amount;
    }
}
