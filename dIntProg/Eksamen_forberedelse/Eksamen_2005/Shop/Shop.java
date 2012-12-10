import java.util.*;
/**
 * Write a description of class Shop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop implements Comparable<Shop>
{
    private String name;
    private int noOfEmployees;
    private int turnover;

    /**
     * Constructor for objects of class Shop
     */
    public Shop(String n, int nOE, int t)
    {
        name = n;
        noOfEmployees = nOE;
        turnover = t;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return name + ", " + noOfEmployees + " ansatte, " + turnover + 
        " tusind kr./år";
    }
    
    /**
     * 
     */
    public int getTurnover()
    {
        return turnover;
    }
    
    /**
     * 
     */
    public int getNoOfEmployees()
    {
        return noOfEmployees;
    }
    
    /**
     * 
     */
    public int compareTo(Shop s)
    {
        if(turnover == s.getTurnover()) {
            return noOfEmployees - s.getNoOfEmployees();
        }
        return turnover - s.getTurnover();
    }

      
}