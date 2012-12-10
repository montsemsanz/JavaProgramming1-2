import java.util.*;

/**
 * This class represents the world seen through the eyes of a
 * particular animal. It contains some constants defining the objects
 * that can be seen in the world, and it provides methods for
 * navigation.
 *
 * The purpose of this class is to clearly define what an animal is
 * supposed to know about the world as opposed to what the program is
 * allowed to know. This way the brain does not use the model directly
 * but only an isolated part, making it harder to cheat.
 *
 * @author David Matuszek
 * @author Martin Geisler
 * @author Mikkel Kroeigaard
 * @author Casper Torndahl
 * @version Januar 25, 2006
 */
public class World {

      // These constants define the things that can be seen in the world.
      // As we all know, the world is flat and has edges.
      public static final int EDGE   = 0;
      public static final int FOX    = 1;
      public static final int HOUND  = 2;
      public static final int BUSH   = 3;

      private Animal animal;
      private Model model;

      /**
       * Creates a new world for an animal and a model.
       * @param a the animal
       * @param m the model
       */
      public World(Animal a, Model m) {
	    animal = a;
	    model = m;
      }

      /**
       * Returns an integer indicating which object is the closest in
       * the given direction. This integer matches one of the constants
       * defined in this class.
       * 
       * @param direction the direction to look in
       * @return the closest object in the given direction
       */
      public Observation look(Direction direction) {
	    return model.look(animal, direction);
      }

      /**
       * Determines whether this animal can move one step in the
       * given direction. An animal cannot move off the edge of
       * the array or onto a bush, but it <i>can</i> move onto
       * another animal.<p>
       *
       * @param direction the direction in which to consider moving
       * @return true if the move is possible
       */
      public boolean canMove(Direction direction) {
	    Observation obs;

	    if (direction == Direction.NONE)
		  return true;
	    
	    obs = look(direction);
	    
	    if(obs.getDistance() > 1)
		  return true;
		      
	    if (obs.getObject() == EDGE || obs.getObject() == BUSH) 
		  return false;
	    
	    return true;
      }

      /**
       * Returns a random integer between lower bound
       * and upper bound, both inclusive.
       * @param lowerBound the lower bound
       * @param upperBound the upperBound
       * @return the random integer
       */
      public int random(int lowerBound, int upperBound) {
	    return Model.random(lowerBound, upperBound);
      }
    
}
