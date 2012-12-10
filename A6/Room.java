/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *                                                         *
 * Anvendelse:  Java-kursus på Systematic, F2000           *
 *                                                         *
 * Beskrivelse: Denne fil indeholder klassen Room der      *
 *              repræsenterer "kamre" i Tutankhamon-       *
 *              præsentationen.                            *
 *                                                         *
 * Oprettet:    29. januar 2000, Michael E. Caspersen      *
 *                                                         *
 * Modificeret: -                                          *
 *                                                         *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

import java.util.Vector;

// This class models a single room in the virtual place that is
// presented.
class Room
{
  // Association 1-many with the other rooms this room is connected to.
  // Vector contains 4 entries, indexed by the values of the constants
  // in class direction, for the four compass directions.
  Vector                exit;

  // The room description
  String                description;
  // The filename containing the image for the room
  String                imageFilename;

  // Construct at room with a description and an image
  public Room( String description, String imageFilename ) {
    this.description = description;
    this.imageFilename = imageFilename;

    exit = new Vector(); 
    // Initialise four exits to be "walls" or "leading nowhere"
    for ( int i = 0; i < 4; i++ ) {
      exit.addElement( null );
    }
  }

  // Return a text describing possible exits from this room
  public String getExitDescription() {
    String s = 
      "You can see exits from the room going: ";
    if ( exit.elementAt(Direction.NORTH) != null ) {
      s += "NORTH ";
    }
    if ( exit.elementAt(Direction.EAST) != null) {
      s += "EAST ";
    }
    if ( exit.elementAt(Direction.SOUTH) != null) {
      s += "SOUTH ";
    }
    if ( exit.elementAt(Direction.WEST) != null) {
      s += "WEST ";
    }
    return s;
  }

  // Return a textual description of this room
  public String getDescription() {
    String s =  description + "\n" + getExitDescription(); 
    return s;
  }

  // Return the name of the image file
  public String getImageFilename() {
    return imageFilename;
  }

  // Return a reference to the room in the given direction. 
  // whichWay must be one of the values specified in class direction.
  // null is returned in case there is no room connected to this
  // room in the given direction.
  public Room leadsTo( int direction ) {
    return (Room) exit.elementAt(direction);
  }

  // Connect this room to "otherRoom" in the direction given by atExit.
  // atExit must be one of the values specified in class direction.
  void connectTo( Room otherRoom, int atExit ) {
    // Safe programming:
    if ( otherRoom == null || 
         atExit < Direction.NORTH || atExit > Direction.WEST ) {
      System.out.println(  
        "ERROR: No room given, or wrong direction in method connectTo" ); 
    } else {
      exit.setElementAt( otherRoom, atExit );
    }
  }
}