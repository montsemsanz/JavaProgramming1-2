import java.util.Vector;
import java.io.*;

import media.*;

// Finally this class models the whole multimedia presentation.
public class GalleryPresentation extends ImagePresenter {
  // Association 1-1 to the 'virtual' Visitor that represents the
  // user in the virtual tomb.
  Visitor       guest;
  
  // Override the applets init metod to get things going.
  // "init" is for applets what "main" is for textual programs.
  public void init() {
    guest = new Visitor( this );
    setupRooms();
  }

  // Create rooms according to the layout of Pharao Tutankhamons tomb
  public void setupRooms() {
    Room pos11, pos12, pos21, pos22;

    pos11 = new Room("Winter Landscape with Hut and Wood Gatherer" , "winter-landscape.jpeg");
    pos12 = new Room("Woman by a Hearth", "woman.jpeg");
    pos21 = new Room("Winter Garden", "winter-garden.jpeg");
    pos22 = new Room("Windmills at Montmartre", "windmills.jpeg");
    
    pos11.connectTo(pos12, Direction.EAST);
    pos12.connectTo(pos11, Direction.WEST);
    
    pos11.connectTo(pos21, Direction.NORTH);
    pos21.connectTo(pos11, Direction.SOUTH);
    
    pos12.connectTo(pos22, Direction.NORTH);
    pos22.connectTo(pos12, Direction.SOUTH);

    pos22.connectTo(pos21, Direction.WEST);
    pos21.connectTo(pos22, Direction.EAST);
    
    // Finally we set the Visitor at the staircase
    guest.setAt(pos11);
  }

  // These methods specialise the framework for our purpose.
  public void northButtonPressed() {
    guest.move(Direction.NORTH);
  }
  public void eastButtonPressed() { 
    guest.move(Direction.EAST);
  }
  public void southButtonPressed() {
    guest.move(Direction.SOUTH);
  }
  public void westButtonPressed() { 
    guest.move(Direction.WEST);
  }
}