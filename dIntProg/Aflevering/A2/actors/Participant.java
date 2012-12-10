/**
 * Models a particant in a play.
 */
public abstract class Participant {
    
    // the name of the participant
    protected String name;

    // the number of tricks the participant has performed
    protected int number;
    
    /**
     * Creates a new participant.
     * @param n the name of the participant
     */
    public Participant(String n) {
        name = n;
        number = 0;
    }

    /**
     * Tells the participant to clap a number of times.
     * @param n the number of claps
     */
    public abstract void clap(int n);

    /**
     * Tells the participant to turn a number of times.
     * @param n the number of turns
     */
    public abstract void turn(int n);

    /**   public void printNumberOfTricks() {
        System.out.println(number + " (" + name + ")");
    }
}

     * Prints the number of tricks the participant has performed.
     */
    public void printNumberOfTricks() {
        System.out.println(number + " (" + name + ")");
    }
}
