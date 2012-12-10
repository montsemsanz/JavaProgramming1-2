import java.util.List;
import java.util.ArrayList;
public class MMS implements Transaction{
    private List<Multimedie> multimedia;
    private String receiver;
    private int totalSize;
    private static MMSPricer globalPricer = new StepPricer();
    private String type;
    private MMSPricer pricer;
    
    public MMS(String r, String t){
        receiver = r;
        multimedia = new ArrayList<Multimedie>();
        totalSize = 0;
        type = t;
        pricer = MMS.globalPricer;
    }
    
    public static void setPricer(MMSPricer m){
        MMS.globalPricer = m;
    }
    public void addMultimedie(Multimedie m){
        multimedia.add(m);
        totalSize = totalSize + m.getSize();
    }
    
    public void removeMultimedie(Multimedie m){
        multimedia.remove(m);
        totalSize = totalSize - m.getSize();
    }
    
    public int getTotalSize(){
        return totalSize;
    }
    
    public String getType(){
        return type;
    }
        
    public int getAmount(){
        return pricer.getAmount(this);
    }
    
    @Override
    public String toString(){
        return "MMS to: " + receiver + " multimedia: " + multimedia.size() + " amount: " + getAmount();
    }
}
