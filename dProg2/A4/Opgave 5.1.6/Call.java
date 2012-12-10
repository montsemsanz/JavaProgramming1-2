
/**
 * Write a description of class Call here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Call extends Transaction
{
//     private int amount;
    private String recipient;

    /**
     * Opret et objekt af klassen opkald.
     */
    public Call(int a, String r)
    {
        super(-a);
        recipient = r;
    }
    
    /**
     * Etabler en String repræsentation af objektet.
     */
    public String toString()
    {
        return "Opkald: " + amount + " kr.";
    }
}
