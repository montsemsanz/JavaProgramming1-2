import java.util.*;
/**
 * Write a description of class Company here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Company
{
    private String name;
    private List<Customer> customers;

    /**
     * Constructor for objects of class Company
     */
    public Company(String n)
    {
        name = n;
        customers = new ArrayList<Customer>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(Customer c)
    {
        customers.add(c);
    }
    
    /**
     * 
     */
    public void remove(Customer c)
    {
        customers.remove(c);
    }
    
    /**
     * 
     */
    public int noOfCustomers(String city)
    {
        int total = 0;
        for(Customer c : customers) {
            if(city.equals(c.getCity())) {
                total = total + 1;
            }
        }
        return total;
    }
    
    /**
     * 
     */
    public List<Customer> find(int threshold)
    {
        List<Customer> result = new ArrayList<Customer>();
        for(Customer c : customers) {
            if(threshold < c.getAmount()) {
                result.add(c);
            }
        }
        return result;
    }
    
    /**
     * 
     */
    public void printCustomers()
    {
        Collections.sort(customers);
        for(Customer c : customers) {
            System.out.println(" " + c);
        }
    }
}