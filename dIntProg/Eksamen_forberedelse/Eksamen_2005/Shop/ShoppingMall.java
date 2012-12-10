import java.util.*;
/**
 * Write a description of class ShoppingMall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShoppingMall
{
    private String name;
    private List<Shop> shops;
    /**
     * Constructor for objects of class ShoppingMall
     */
    public ShoppingMall(String n)
    {
        name = n;
        shops = new ArrayList<Shop>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(Shop s)
    {
        shops.add(s);
    }
    
    /**
     * 
     */
    public void remove(Shop s)
    {
        shops.remove(s);
    }
    /**
     * 
     */
    public Shop bestTurnover()
    {
        Shop bestTurnoverYet=shops.get(0);
        for(Shop s : shops) {
            if(s.getTurnover() > bestTurnoverYet.getTurnover()) {
                bestTurnoverYet = s;
            }
        }
        return bestTurnoverYet;
    }
    
    /**
     * 
     */
    public int totalTurnover()
    {
        int total = 0;
        for(Shop s : shops) {
            total = total + s.getTurnover();
        }
        return total;
    }
    
    /**
     * 
     */
    public void printShops()
    {
        Collections.sort(shops);
        for(Shop s : shops) {
            System.out.println(" " + s);
        }
    }
    
    
}
