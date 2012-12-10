import java.util.*;
/**
 * Write a description of class Subscription here.
 * 
 * @author Susie 
 * @version 28.11.07
 */
public class Subscription 
{
    private String number;
    private int balance;
    private List<Transaction> transactions;

    /**
     * Opret et objekt af klassen Subscription.
     */
    public Subscription(String n)
    {
        number = n;
        transactions = new ArrayList<Transaction>();
        Payment p = new Payment(200);
        transactions.add(p);
        balance = 0 + p.getAmount();
    }

    /**
     * Føj en transaktion til listen over alle transaktioner. 
     */
    public void add(Transaction t)
    {
        transactions.add(t);
        balance = balance + t.getAmount();
    }
    
    /**
     * Returner abonnementets/kontoens balance.
     * @ return balance.
     */
    public int getBalance()
    {
        return balance;
    }
    
    /**
     * Opret en String repræsentation af abonnementet/kontoen.
     */
    public String toString()
    {
        return "Abonnement nr: " + number + ". " + "Balance: " + 
        getBalance() + " kr.";
    }
    
    /**
     * Udskriv en liste over alle transaktioner på abonnementet/kontoen.
     */
    public void printActivityList()
    {
        for(Transaction t : transactions) {
            System.out.println(" " + t);
        }
    }
    
}
