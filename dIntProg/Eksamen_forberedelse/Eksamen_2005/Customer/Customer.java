import java.util.*;
/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer implements Comparable<Customer>
{
    private String name;
    private String city;
    private int amount;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String n, String c, int a)
    {
        name = n;
        city = c;
        amount = a;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return name + ", " + city + ", " + amount + " kr.";
    }
    
    /**
     * 
     */
    public String getCity()
    {
        return city;
    }
    
    /**
     * 
     */
    public int getAmount()
    {
        return amount;
    }
    
    /**
     * 
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * 
     */
    public int compareTo(Customer c)
    {
        if(city == c.getCity()) {
            return name.compareTo(c.getName());
        }
        if(name == c.getName()) {
            return amount - c.getAmount();
        }
        return city.compareTo(c.getCity());
    }
     
}
