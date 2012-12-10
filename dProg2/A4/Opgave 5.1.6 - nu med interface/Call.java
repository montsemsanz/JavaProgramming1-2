
/**
 * Write a description of class Call here.
 * 
 * @author Susie
 * @version 28.11.07
 */
public class Call implements Transaction
{
    private int amount;
    private String recipient;

    /**
     * Opret et objekt af klassen opkald.
     */
    public Call(int a, String r)
    {
        amount = a;
        recipient = r;
    }
    
    /**
     * Etabler en String repræsentation af objektet.
     */
    public String toString()
    {
        return "Opkald: " + amount + " kr.";
    }
    
    /**
     * Returner omkostningen ved opkaldet.
     */
    public int getAmount()
    {
        return -amount;
    }
}
