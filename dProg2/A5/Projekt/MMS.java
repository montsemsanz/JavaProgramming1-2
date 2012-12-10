import java.util.*;
/**
 * Write a description of class MMS here.
 * 
 * @author Susie.
 * @version 02.12.07. 
 */
public class MMS implements Transaction
{
    private String recipientNo;
    private List<Multimedie> multimedier;

    /**
     * Opret et objekt af klassen MMS
     */
    public MMS(String rN)
    {
        recipientNo = rN;
        multimedier = new ArrayList<Multimedie>();
    }

    /**
     * Opret en String repræsentation af objektet med udgangspunkt i
     * modtagernummeret og antal vedhæftede MMS'er.
     */
    public String toString()
    {
        return "Send til: " + recipientNo + "Antal MMS: " + multimedier.size();
    }
    
    /**
     * Returner beløb ved forsendelse af MMS-beskeden.
     * @ return int amount.
     */
    public int getAmount()
    {
        if(this.getTotalSize() == 0) {
            return 0;
        }
        else if((0 < this.getTotalSize()) && (this.getTotalSize() < 10)) {
            return 1;
        }
        else if((10 <= this.getTotalSize()) && (this.getTotalSize() < 50)) {
            return 3;
        }
        else if((50 <= this.getTotalSize()) && (this.getTotalSize() < 100)) {
            return 5;
        }
        else {
            sendFejlmeddelelse();
            return 0;
        }
    }
    
    /**
     * Tilføj et objekt til listen "multimedier". 
     */
    public void add(Multimedie m)
    {
        multimedier.add(m);
    }
    
    /**
     * Fjern et objekt fra listen "multimedier".
     */
    public void remove(Multimedie m)
    {
        multimedier.remove(m);
    }
    
    /**
     * Udregn MMS-objektets totale størrelse i kb.
     * @return int totalSize.
     */
    public int getTotalSize()
    {
        int total = 0;
        for(Multimedie m : multimedier) {
            total = total + m.getSize();
        }
        return total;
    }
    
    /**
     * Sender fejlmeddelelse til brugeren, hvis MMS-beskedens størrelse 
     * overskrider den tilgængelige hukommelse.
     */
    public void sendFejlmeddelelse()
    {
        System.out.println("Beskeden kan ikke afsendes, da antallet af kilobytes " +
        "overstiger den tilgængelige hukommelse. ");
    }
}
