
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    private String name;
    private int price;
    private int grade;

    /**
     * Constructor for objects of class Player
     */
    public Player(String n, int p, int g)
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
    public int getPrice()
    {
        return price;
    }
    
    /**
     * 
     */
    public double getInvestment()
    {
        double dGrade = grade;
        double dPrice = price;
        return (dGrade / dPrice);
    }
    
}
