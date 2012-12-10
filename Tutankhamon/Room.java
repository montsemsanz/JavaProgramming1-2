import java.util.Vector;

/**
 * Room modellerer et rum i Tutankhamon-verdenen. 
 * Oprindeligt skrevet til Java-kursus på Systematic, F2000.
 *
 * @author Michael E. Caspersen, revideret af Erik Ernst
 * @version Januar 2000, Maj & November 2004
 */

public class Room
{
    // Association 1-mange med de øvrige rum der er forbindelse til
    // Vector'en indeholder 4 objekter, indiceret som Direction.NORTH osv.
    private Vector exit;
    
    // beskrivelse af rummet
    private String description;
    // filnavn for billedet af dette rum
    String imageFilename;
    
    public Room( String description, String imageFilename ) {
        this.description = description;
        this.imageFilename = imageFilename;
        exit = new Vector(); 
        // som udgangspunkt kan ingen andre rum nås herfra
        for ( int i = 0; i < 4; i++ ) {
            exit.addElement( null );
        }
    }
    
    /**
     * @return En tekstuel beskrivelse af dette rums udgange
     */
    public String getExitDescription() {
        String s = "You can see exits from the room going: ";
        if ( exit.elementAt(Direction.NORTH) != null ) { s += "NORTH "; }
        if ( exit.elementAt(Direction.EAST) != null) { s += "EAST "; }
        if ( exit.elementAt(Direction.SOUTH) != null) { s += "SOUTH "; }
        if ( exit.elementAt(Direction.WEST) != null) { s += "WEST "; }
        return s;
    }

    /**
     * @return En tekstuel beskrivelse af dette rum
     */
    public String getDescription() {
        String s =  description + "\n" + getExitDescription(); 
        return s;
    }
    
    public String getImageFilename() {
        return imageFilename;
    }
    
    /**
     * Returnerer en reference til rummet i den givne retning.
     * Hvis der ikke er noget rum i den retning returneres
     * <code>null</code>.
     * @param direction retningen, som er en af Direction.NORTH, SOUTH..
     */
    public Room leadsTo( int direction ) {
        return (Room) exit.elementAt(direction);
    }
    
    /**
     * Forbind dette rum med det andet givne rum i den givne retning.
     * @param otherRoom det andet rum
     * @param atExit retningen
     */
    void connectTo( Room otherRoom, int atExit ) {
        // Check at argumenterne er rimelige:
        if (otherRoom==null || atExit<Direction.NORTH || atExit>Direction.WEST)
            {
                System.out.println(
                                   "ERROR: No room given, "+
                                   "or wrong direction in method connectTo");
            } else {
                exit.setElementAt(otherRoom, atExit);
            }
    }
}
