/**
 *  This class is the main class of the "Prisoner Of Alcatraz" application. 
 *  "Prisoner Of Alcatraz" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */

public class Game 
{
    private Parser parser;
    private Room currentRoom;
        
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        createRooms();
        parser = new Parser();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        Room prisonyard, cellblockA, cellblockD, dininghall, staffquarters, tunnel, roof;
      
        // create the rooms
        prisonyard = new Room("in the prison yard outside cell block A and D");
        cellblockA = new Room("in cell block A - living quarters for regular prisoners");
        cellblockD = new Room("in cell block D - isolation quarters for dangerous prisoners");
        dininghall = new Room("in a large dininghall with tables and benches");
        staffquarters = new Room("in the prisonguards quarters with the wardens office");
        tunnel = new Room("in the tunnel beneath cell block A"); 
        roof = new Room("on the roof of the dininghall-building");
        
        // initialise room exits
        prisonyard.setExits("east", cellblockA);
        prisonyard.setExits("south", dininghall);
        prisonyard.setExits("west", cellblockD);
        cellblockA.setExits("west", prisonyard);
        cellblockD.setExits("east", prisonyard);
        dininghall.setExits("north", prisonyard);
        dininghall.setExits("east", staffquarters);
        staffquarters.setExits("west", dininghall);
        cellblockA.setExits("down", tunnel);
        tunnel.setExits("up", cellblockA);
        dininghall.setExits("up", roof);
        roof.setExits("down", dininghall);
        
        Item spoon, rope, knife, keys, rock, uniform;
        
        // create items
        spoon = new Item("A spoon", 20);
        rope = new Item("A rope", 50); 
        knife = new Item("A knife", 30);
        keys = new Item("The keys to the cells in block A", 100); 
        rock = new Item("A rock", 20);
        uniform = new Item("A prison guards uniform", 100);
                
        // initialise items in rooms
        prisonyard.addItem(rock);
        staffquarters.addItem(uniform);
        dininghall.addItem(spoon);
        dininghall.addItem(knife);
        staffquarters.addItem(keys);
        cellblockD.addItem(rope);
                
        currentRoom = prisonyard;  // start game in prison yard
    }
    
    /**
     *  Main play routine. Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
                
        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to Prisoner Of Alcatraz!");
        System.out.println("Prisoner Of Alcatraz is a new, incredibly boring adventure game.");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
        printLocationInfo();
    }

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) {
            printHelp();
        }
        else if (commandWord.equals("go")) {
            goRoom(command);
        }
        else if (commandWord.equals("look")) {
            look();
        }
        else if (commandWord.equals("back")) {
            back();
        }
        else if (commandWord.equals("quit")) {
            wantToQuit = quit(command);
        }
        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        System.out.println("You are a prisoner serving a life sentence in the infamous");
        System.out.println("state penitentiary on Alcatraz Island. You want to escape.");
        System.out.println("But how...");       
        System.out.println();
        System.out.println("Your command words are:");
        System.out.println(parser.showCommands());
    }

    /** 
     * Try to go to one direction. If there is an exit, enter
     * the new room, otherwise print an error message.
     */
    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);
        
        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        else {
            currentRoom = nextRoom;
            printLocationInfo();
        }
    }

    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
    
    /**
     * 
     */
    private void printLocationInfo()
    {
        System.out.println(currentRoom.getLongDescription());
        System.out.println();
    }
    
    /**
     * 
     */
    private void look()
    {
        System.out.println(currentRoom.getLongDescription());
    }
    
    /**
     * 
     */
    private void back()
    {
    }
}
