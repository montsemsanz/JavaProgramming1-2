/**
 * Models a character actor.
 */
public class CharacterActor extends Actor {

    /**
     * Creates a new character actor.
     * @param name the name of the character actor
     */
    public CharacterActor(String name) {
        super(name);
    }
    
    /**
     * Claps a number of times and dramatizes it.
     * @param n the number of claps
     */
    public void clap(int n) {
        super.clap(n);
        dramatize();
    }
    
    /**
     * Turns a number of times and dramatizes it.
     * @param n the number of turns
     */
    public void turn(int n) {
        super.turn(n);
        dramatize();
    }
    
    // dramatize
    private void dramatize() {
        System.out.println("Thank you very much!");
        System.out.println("Bow");
    }
    
    /**
     * Prints the number of tricks performed so far and dramatizes it.
     */
    public void printNumberOfTricks() {
        super.printNumberOfTricks();
        dramatize();
    }
}
