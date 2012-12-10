
public class Call extends Transaction{
    private int amount;
    private String recipient;
    
    public Call(String recipient, int amount){
        this.amount = amount;
        this.recipient = recipient;
    }
    public int getAmount(){
        return -amount;
    }
    
    public String getType(){
        return "Call: ";
    }
}
