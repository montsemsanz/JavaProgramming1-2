import java.util.Vector;
import java.io.*;
import media.*;

/**
 * TutankhamonPresentation bruger ImagePresenter som 
 * superklasse og er derved en instantiering af dette
 * (mini)framework.
 * Oprindeligt skrevet til Java-kursus på Systematic, F2000.
 *
 * @author Michael E. Caspersen, revideret af Erik Ernst 
 * @version Januar 2000, Maj & November 2004
 */

public class TutankhamonPresentation extends ImagePresenter 
{

    // Association 1-1 til en Visitor
    Visitor guest;
  
    // "init" bruges til opstart af en applet
    public void init() {
        guest = new Visitor( this );
        setupRooms();
    }
    
    public void setupRooms() {
        Room staircase, antechamber, annex, tomb, treasury, corridor, introduction;
        
        staircase = new Room(
                             "You are on a brightly sunlit descending staircase "+
                             "leading NORTH and down.",
                             "tutstaircase1.jpg");
        antechamber = new Room(
                               "You are a dark room known as the antechamber. "+
                               "There are a lot of precious antiques here, but "+
                               "the room is dominated by three large wooden royal beds, shaped "+
                               "as lions and plated with gold",
                               "tutantechamber.jpg");
        annex = new Room( 
                         "You are in the annex full of 3500 years old food",
                         "tutannex.jpg");
        tomb = new Room( 
                        "You are in the burial chamber of Tutankhamon. "+
                        "The sarcophagus fills "+
                        "most of the room barely leaving room for you.",
                        "tutburial.jpg");
        treasury = new Room( 
                            "You are in the treasury. It is dominated by a large "+
                            "wooden figure of the Anubis good in front. Behind it "+
                            "you can see a beautiful golden shrine.",
                            "tuttreasury.jpg");
                            
        corridor = new Room(
                            "You are in a narrow corridor. ", "tutcorridor.jpg");
                            
        introduction = new Room(
                            "This is an image presentation of the Tutankhamon toom." +
                            "You can move through the toom by pressing the " +
                            "button, that leads in the direction, you want to go: ",
                            "tutmask.gif");
                            
        staircase.connectTo( corridor, Direction.NORTH );
        
        antechamber.connectTo( corridor, Direction.SOUTH );
        antechamber.connectTo( annex, Direction.NORTH );
        antechamber.connectTo( tomb, Direction.EAST );
        
        annex.connectTo( antechamber, Direction.SOUTH );
        
        tomb.connectTo( antechamber, Direction.WEST );
        tomb.connectTo( treasury, Direction.SOUTH );
        
        treasury.connectTo( tomb, Direction.NORTH );
        
        introduction.connectTo( staircase, Direction.NORTH );
        introduction.connectTo( staircase, Direction.WEST );
        introduction.connectTo( staircase, Direction.EAST );
        introduction.connectTo( staircase, Direction.SOUTH );
        
        guest.setAt( introduction );
    }
    
    // redefiner metoder i frameworket efter vores behov
    public void northButtonPressed() { guest.move(Direction.NORTH); }
    public void eastButtonPressed() { guest.move(Direction.EAST); }
    public void southButtonPressed() { guest.move(Direction.SOUTH); }
    public void westButtonPressed() { guest.move(Direction.WEST); }
}
