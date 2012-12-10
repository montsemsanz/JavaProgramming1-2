/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *                                                         *
 * Anvendelse:  Java-kursus på Systematic, F2000           *
 *                                                         *
 * Beskrivelse: Denne fil indeholder klassen Visitor der   *
 *              repræsenterer "det virtuelle jeg" i        *
 *              Tutankhamon-præsentationen.                *
 *                                                         *
 * Oprettet:    29. januar 2000, Michael E. Caspersen      *
 *                                                         *
 * Modificeret: -                                          *
 *                                                         *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

import media.*;

// This class models the 'virtual' visitor in the virtual place
// i.e. the user moving around in the multimedia presentation.
class Visitor
{
  // Association 1-1 with the room this visitor is currently in.
  Room			location;
  // Association 1-1 with presentation medium used.
  ImagePresenter        medium;

  // Konstruct a visitor using the Presenter m
  public Visitor( ImagePresenter m ) {
    medium = m;
  }

  // Move this visitor to a new room "where". "where" must be a valid
  // room in the presentation
  public void setAt( Room where )  {
    location = where;
    try {
      medium.showImage( location.getImageFilename() );
    }
    catch ( Exception e ) { System.out.println(e.getMessage()); };
    medium.showText( location.getDescription() );
  }

  // Move this visitor to the room in the given direction inDirection.
  // inDirection must be one of the values specified in class direction.
  public void move(int direction) {
    Room newRoom = location.leadsTo(direction);
    // we hit a wall
    if ( newRoom == null ) {
      medium.showText( 
       "Oopmf... You just hit a wall - no exit in that direction.\n"+
       location.getExitDescription() );
    } else {
      setAt( newRoom );
    }
  }
}