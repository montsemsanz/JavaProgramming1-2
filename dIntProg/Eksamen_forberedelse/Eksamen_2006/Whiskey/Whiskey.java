import java.util.*;
/**
 * Write a description of class Whiskey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Whiskey implements Comparable<Whiskey>
{
    private String name;
    private int price;
    private int grade;

    /**
     * Constructor for objects of class Whiskey
     */
    public Whiskey(String n, int p, int g)
    {
        name = n;
        price = p;
        grade = g;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return name + ", " + price + ", " + grade;
    }
    
    /**
     * 
     */
    public int getGrade()
    {
        return grade;
    }
    
    /**
     * 
     */ 
     public double getRatio()
     {
         double dGrade = grade;
         double dPrice = price;
         return dGrade / dPrice;
     }
     
     /**
     * 
     */ 
     public int compareTo(Whiskey w)
     {
         if(getRatio() < w.getRatio()) {
             return -1;
         }
         if(getRatio() > w.getRatio()) {
             return 1;
         }
         return 0;
         
     }

}
