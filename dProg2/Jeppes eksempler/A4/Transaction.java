public abstract class Transaction{
    public abstract int getAmount();
    public abstract String getType();
    
    public String toString(){
        return getType() + "$" + getAmount();
    }
    
}
