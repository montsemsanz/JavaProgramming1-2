public class SMS implements Transaction
{
    private int amount;
    private String recipient;
    private String message;
    
    public SMS(String recipient, int amount, String message){
        this.recipient = recipient;
        this.amount = amount;
        this.message = message;
    }
    
    public int getAmount(){
        return -amount;
    }
    
    @Override
    public String toString(){
        return "SMS to: " + recipient + "  amount: " + amount;
    }

}
