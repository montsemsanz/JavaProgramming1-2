/**
 * This class represents an observation in a direction.
 * It contains what is seen and the distance to it.
 *
 * @author Casper Torndahl
 * @version August 16, 2005
 */
public class Observation{
      private int object;
      private int distance;

      public Observation(int o, int d){
	    object = o;
	    distance = d;
      }

      public int getObject(){
	    return object;
      }

      public int getDistance(){
	    return distance;
      }
      
}
