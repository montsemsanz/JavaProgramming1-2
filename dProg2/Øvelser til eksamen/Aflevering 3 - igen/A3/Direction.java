import java.util.*;
public class Direction
{
    private String name;
    private Direction opposite;
    private static Collection<Direction> allDirections = new ArrayList();

    /**
     * Constructor for objects of class Direction
     */
    public Direction(String n)
    {
        name = n;
        Direction.allDirections.add(this);
    }

    public void setOpposite(Direction d)
    {
        opposite = d;
    }
    
    public Direction opposite()
    {
        return opposite;
    }
    
    public String toString()
    {
        return name;
    }
    
    public static Direction getDirection(String dir)
    {
        for(Direction d : allDirections){
            if(d.name.equals(dir)){
                return d;
            }
        }
        return null;
    }
}