import java.util.List;
import java.util.ArrayList;
import java.io.*;
public class Subscription implements Serializable{
    private static final String FILENAME = "subscription.bin";
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
    }
    
    public int getBalance(){
        int sum = 0;
        for(Transaction t : transactions){
            sum = sum + t.getAmount();
        }
        return sum;
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
    
    public void save(){
        try{
            FileOutputStream fos = new FileOutputStream(FILENAME, false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        
            oos.writeObject(this);
            oos.close();
            } catch (Exception e){
                System.out.println("Something went terribly wrong");
            }
    }
    
    
    public static Subscription load(){
        try{
            FileInputStream fis = new FileInputStream(FILENAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
        
            Subscription sub = (Subscription)ois.readObject();
        
            ois.close();
            return sub;
            } 
            catch (Exception e) {
                System.out.println("Something went horribly wrong");
            }
            return null;
        }
        
    }

