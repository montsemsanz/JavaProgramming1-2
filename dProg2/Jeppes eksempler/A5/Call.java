
public class Call implements Transaction{
    private int amount;
    private String recipient;
    
    public Call(String recipient, int amount){
        this.amount = amount;
        this.recipient = recipient;
    }
    public int getAmount(){
        return -amount;
    }
    
    @Override
    public String toString(){
        return "Call to: " + recipient + " amount: " + amount;
    }
}
