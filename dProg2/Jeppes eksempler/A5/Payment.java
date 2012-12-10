public class Payment  implements Transaction{
    private int amount;
    
    public Payment(int amount){
        this.amount = amount;
    }
    
    public int getAmount(){
        return amount;
    }
    
    @Override
    public String toString(){
        return "Payment.             amount: " + amount;
    }

}
