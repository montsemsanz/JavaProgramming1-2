public class Payment extends Transaction{
    private int amount;
    
    public Payment(int amount){
        this.amount = amount;
    }
    
    public int getAmount(){
        return amount;
    }
    
    public String getType(){
        return "Payment: ";
    }
}