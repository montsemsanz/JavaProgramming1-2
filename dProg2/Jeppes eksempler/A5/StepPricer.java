
public class StepPricer implements MMSPricer
{
    public int getAmount(MMS m){
        int s = m.getTotalSize();
        if(s < 10)return -1;
        if(s < 50)return -3;
        return -5;
    }
}

