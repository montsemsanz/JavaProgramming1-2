
/**
 * Write a description of class Payment here.
 * 
 * @author Susie 
 * @version 28.11.07
 */
public class Payment implements Transaction
{
    private int amount;

    /**
     * Opret et objekt af klassen Payment.
     */
    public Payment(int a)
    {
        amount = a;
    }

    /**
     * Etabler en String repr�sentation af objektet.
     */
    public String toString()
    {
        return "Indbetaling: " + amount + " kr.";
    }
    
    /**
     * Returner indbetalinger p� kontoen.
     */
    public int getAmount()
    {
        return amount;
    }
}
