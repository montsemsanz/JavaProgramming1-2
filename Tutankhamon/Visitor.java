import media.*;

/**
 * Visitor modellerer en besøgende ("mig") i Tutankhamon-verdenen.
 * Oprindeligt skrevet til Java-kursus på Systematic, F2000.
 *
 * @author Michael E. Caspersen, revideret af Erik Ernst
 * @version Januar 2000, Maj & November 2004
 */

public class Visitor
{
    // Association 1-1 med det rum, "jeg" er i lige nu
    Room location;
    // Association 1-1 med mediet til præsentation
    ImagePresenter medium;
    
    public Visitor( ImagePresenter m ) {
        medium = m;
    }

    /** 
     * Flyt denne Visitor til et nyt rum.
     * @param where det nye rum, som skal være et rum i præsentationen 
     */
    public void setAt( Room where )  {
        location = where;
        try {
            medium.showImage( location.getImageFilename() );
        }
        catch ( Exception e ) { System.out.println(e.getMessage()); };
        medium.showText( location.getDescription() );
    }
    
    /**
     * Flyt denne Visitor til rummet i en given retning.
     * @param direction den retning, det nye rum findes i
     */
    public void move(int direction) {
        Room newRoom = location.leadsTo(direction);
        // se om vi ramte en mur
        if ( newRoom == null ) {
            medium.showText( 
                            "Oopmf... You just hit a wall - no exit in that direction.\n"+
                            location.getExitDescription() );
        } else {
            setAt( newRoom );
        }
    }
}
