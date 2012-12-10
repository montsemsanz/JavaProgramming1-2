import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.*;
/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "Prisoner Of Alcatraz" application. 
 * "Prisoner Of Alcatraz" is a very simple, text based adventure game.  
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
    private HashMap<String, Room> exits;
    private List<Item> items;
    
    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<String, Room>();
        items = new ArrayList<Item>();
    }

    /**
     * Define an exit from this room.  
     * @param direction The direction of the exit.
     * @param neighbor The room in the given direction.
     */
    public void setExits(String direction, Room neighbor) 
    {
        exits.put(direction, neighbor);
    }
    
    /**
     * Return the room that is reached if we go from this 
     * room in direction "direction". If there is no room 
     * in that direction, return null.
     * @param north.
     * @param east.
     * @param south.
     * @param west.
     */
    public Room getExit(String direction)
    {
        return exits.get(direction);
    }
    
    /**
     * Return a description of the room's exits.
     * @return A description of the available exits.
     */
    public String getExitString()
    {
        String returnString = "Exits: ";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }
            
    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Return a long description of this room, of the form:
     *      You are ...
     *      Exits: north west
     * @return A description of the room, including exits. 
     */
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString() + 
        ".\n" + "Items: " + listOfAllItems();
    }
    
    /**
     * Add an item to the room.
     * @param i.
     */
    public void addItem(Item i)
    {
        items.add(i);
    }
    
    /**
     * Remove an item from the room.
     * @param i.
     */
    public void removeItem(Item i)
    {
        items.remove(i);
    }
    
    /**
     * @return a list of all the items in the room.
     */
    public String listOfAllItems()
    {
        String listOfItems = " ";
        for(Item i : items) {
            listOfItems += i.getDescription() + ". ";
        }
        return listOfItems;
    }
    
}
