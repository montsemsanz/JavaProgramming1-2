
/**
 * Write a description of class SideEffect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SideEffect
{
    private String name;
    private int riscLevel;

    /**
     * Constructor for objects of class SideEffect
     */
    public SideEffect(String n, int r)
    {
        name = n;
        riscLevel = r;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return name + ", risiko: " + riscLevel;
    }
    
    /**
     * 
     */
    public int getRiscLevel()
    {
        return riscLevel;
    }
     
}
