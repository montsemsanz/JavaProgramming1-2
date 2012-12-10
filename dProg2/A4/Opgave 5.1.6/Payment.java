
/**
 * Write a description of class Payment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Payment extends Transaction
{
    
    /**
     * Opret et objekt af klassen Payment.
     */
    public Payment(int a)
    {
        super(a);
    }

    /**
     * Etabler en String repræsentation af objektet.
     */
    public String toString()
    {
        return "Indbetaling: " + amount + " kr.";
    }
}
