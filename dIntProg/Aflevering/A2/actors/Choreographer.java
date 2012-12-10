/**
 * Models a choreograph. There are two participants assigned to every
 * choreograph, and the choreograph simply passes on the orders it
 * gets to its two associated participants.
 */
public class Choreographer extends Participant  {
    
    private Participant p1, p2;
    
    /**
     * Creates a new choreograph.
     * @param name the name of the choreograph
     * @param p1 the first participant assigned to this choreograph
     * @param p2 the second participant assigned to this choreograph
     */
    public Choreographer(String name, Participant p1, Participant p2) {
        super(name);
        this.p1 = p1;
        this.p2 = p2;
        System.out.println(name + " is ready");
    }
    
    /**
     * Assigns two participants to the choreograph.
     * @param p1 the first participant
     * @param p2 the second participant
     */
    public void setParticipants(Participant p1, Participant p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    /**
     * Claps a number of times.
     * @param n the number of claps
     */
    public void clap(int n) {
        p1.clap(n);
        p2.clap(n);
        number = number + 2*n;
    }

    /**
     * Turns a number of times.
     * @param n the number of turns
     */    
    public void turn(int n) {
        p1.turn(n);
        p2.turn(n);
        number = number + 2*n;
    }
    
}
