import java.util.List;
import java.util.ArrayList;

public class Subscription{
    private String number;
    private int balance;
    private List<Transaction> transactions;
    
    public Subscription(String number){
        this.number = number;
        transactions = new ArrayList<Transaction>();
        add(new Payment(200));
    }
    
    public void add(Transaction t){
        transactions.add(t);
        balance = balance + t.getAmount();
    }
    
    //Invariant: balance should always be equal to the sum of transactions.
    public int getBalance(){
        return balance;
    }
    
    public void remove(Transaction t){
        transactions.remove(t);
        balance = balance - t.getAmount();
    }
    
    public void printActivityList() {
        System.out.println(this);
        for(Transaction t : transactions){
            System.out.println("  " + t);
        }
    }   
    
    @Override
    public String toString() {
        return "Subscription for no.: " + number + " Balance: " + getBalance();
    }
}
