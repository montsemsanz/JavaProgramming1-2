import java.util.*;
/**
 * Write a description of class Direction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Direction
{
    private String name;
    private Direction opposite;
    private static Collection<Direction> allDirections = 
    new ArrayList<Direction>();
    

    /**
     * Constructor for objects of class Direction
     */
    public Direction(String n)
    {
        name = n;
        Direction.allDirections.add(this);
    }
    
    /**
     * An example of a method
     */

    public void setOpposite(Direction d)
    {
        opposite = d;
        opposite.opposite = this;
    }
    
    /**
     * 
     */
    public Direction opposite()
    {
        return opposite;
    }
    
    /**
     * 
     */
    public String toString()
    {
        return name;
    }
    
    /**
     * 
     */
    public static Direction getDirection(String dir)
    {
        for(Direction d : Direction.allDirections) {
            if(d.name.equals(dir)) {
                return d;
            }
        }
        return null;
    }
}
