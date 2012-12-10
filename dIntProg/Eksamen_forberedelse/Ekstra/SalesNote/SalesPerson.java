import java.util.*;
/**
 * Write a description of class SalesPerson here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SalesPerson
{
    private String name;
    private List<SalesNote> salesnotes;

    /**
     * Constructor for objects of class SalesPerson
     */
    public SalesPerson(String n)
    {
        name = n;
        salesnotes = new ArrayList<SalesNote>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(SalesNote sn)
    {
        salesnotes.add(sn);
    }
    
    /**
     * 
     */
    public void remove(SalesNote sn)
    {
        salesnotes.remove(sn);
    }
    
    /**
     * 
     */
    public SalesNote poorestSale()
    {
        SalesNote poorestSaleYet = salesnotes.get(0);
        for(SalesNote sn : salesnotes) {
            if(sn.getAmount() < poorestSaleYet.getAmount()) {
                poorestSaleYet = sn;
            }
        }
        return poorestSaleYet;
    }
    
    /**
     * 
     */
    public int totalSales()
    {
        int total = 0;
        for(SalesNote sn : salesnotes) {
            total = total + sn.getAmount();
        }
        return total;
    }
    
    /**
     * 
     */
    public void printSales()
    {
        Collections.sort(salesnotes, new DateComparator());
        for(SalesNote sn : salesnotes) {
            System.out.println(" " + sn);
        }
    }
}