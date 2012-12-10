
/**
 * Abstract class Transaction - write a description of the class here
 * 
 * @author Susie 
 * @version 28.11.07
 */
public abstract class Transaction
{
    protected int amount;
    
    public Transaction(int a)
    {
    amount = a;
    }

    /**
     * Returner det pågældende beløb.
     */
    public int getAmount()
    {
        return amount;
    }
}
