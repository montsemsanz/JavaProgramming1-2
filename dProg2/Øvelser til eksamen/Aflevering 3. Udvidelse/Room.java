import java.util.HashMap;
import java.util.Set;
/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */
public class Room 
{
    private String description;
    private HashMap<Direction, Room> exits;
    
    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<Direction, Room>(); 
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExits(Direction direction, Room neighbour) 
    {
        exits.put(direction, neighbour);
    }
    
    public void connectTo(Direction direction, Room to)
    {
        setExits(direction, to);
        to.setExits(direction.opposite(), this);
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * 
     */
    public String getLongDescription()
    {
        return "You are " + description + "\n" + getExitString();
    }
    
    public Room getExit(Direction direction)
    {
        return exits.get(direction);
    }
        
    /**
     * Return a description of the room's exits, for example, 
     * "Exits: north west".
     * @return A description of the available exits. 
     */
    public String getExitString()
    {
        String returnString = "Exits: ";
        Set<Direction> keys = exits.keySet();
        for(Direction exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }
    
}
        


