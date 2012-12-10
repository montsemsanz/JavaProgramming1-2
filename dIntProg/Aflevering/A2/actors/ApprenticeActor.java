/**
 * Models an apprentice actor.
 */
public class ApprenticeActor extends Actor {
    
    /**
     * Creates a new apprenctice actor.
     * @param name the name of the apprentice actor
     */
    public ApprenticeActor(String name) {
        super(name);
    }
    
    // shows nervousness
    private void showNervousness() {
        System.out.println("Quivers...");    
    }
    
    // shows insecurity
    private void showInsecurity() {
        System.out.println("... was that ok?");    
    }
    
    /**
     * Claps a number of times, showing nervousness and insecurity.
     * @param n the number of claps
     */
    public void clap(int n) {
        showNervousness();
        super.clap(n);
        showInsecurity();
    }
    
    /**
     * Turns a number of times, showing nervousness and insecurity.
     * @param n the number of turns
     */
    public void turn(int n) {
	showNervousness();
        super.turn(n);
        showInsecurity();
    }
    
    /**
     * Prints the number of tricks performed so far.
     */
    public void skrivAntalTricks() {
        System.out.print("I'm not quite sure, but I think it was ");
        super.printNumberOfTricks();
    }
}
