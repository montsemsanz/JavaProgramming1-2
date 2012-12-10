public class LinearPricer implements MMSPricer
{
    public int getAmount(MMS m)
    {
        return -(m.getTotalSize() / 5);
    }
}
