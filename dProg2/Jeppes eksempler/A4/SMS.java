public class SMS extends Transaction
{
    private static int amount = 1;
    private int myAmount;
    private String recipient;
    private String message;
        
    public SMS(String recipient, String message){
        this.recipient = recipient;
        this.message = message;
        myAmount = SMS.amount;
    }
    
    public static void setAmount(int a){
        SMS.amount = a;
    }
        
    public int getAmount(){
        return -myAmount;
    }
    
    public String getType(){
        return "SMS: ";
    }
}
