
/**
 * Write a description of class Plant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plant
{
    private String name;
    private int beautyValue;
    private int utilityValue;

    /**
     * Constructor for objects of class Plant
     */
    public Plant(String n, int bV, int uV)
    {
        name = n;
        beautyValue = bV;
        utilityValue = uV;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return name + ", " + "skønhed:" + " " + beautyValue + ", " + 
        "nytte:" + " " + utilityValue; 
    }
    
    /**
     * 
     */
    public int getValue()
    {
        int value = 0; 
        value = beautyValue * utilityValue;
        return value;
    }
}
