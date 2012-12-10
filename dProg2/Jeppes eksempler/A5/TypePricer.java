public class TypePricer implements MMSPricer
{
    public int getAmount(MMS m)
    {
        if(m.getType().equals("music")) return -10;
        if(m.getType().equals("photograph")) return -20;
        if(m.getType().equals("TV broadcast")) return -50;
        return 0;
    }
}
