/**
 * Data about observation of a hound.
 * 
 * @author Casper Torndahl
 * @version Januar 30, 2006
 */
public class HoundData implements Comparable<HoundData>{
      private Direction direction; // Direction to hound
      private int distance; // Distance to hound
      private int seen; // How many turn it has been since it was seen

      /**
       * Initialises the hounddata
       */
      public HoundData(){
	    seen = 0;
      }

      /**
       * Adds a turn to time since seen hound
       */
      public void newTurn(){
	    seen++;
      }

      /**
       * Returns the rounds since the hound was seen
       *
       * @return Round since hound was seen
       */
      public int lastSeen(){
	    return seen;
      }

      /**
       * Sets the direction to the hound
       *
       * @param d Direction to hound
       */
      public void setDirection(Direction d){
	    direction = d;
      }

      /**
       * Returns the direction to the hound
       *
       * @return Direction to hound
       */
      public Direction getDirection(){
	    return direction;
      }

      /**
       * Sets the distance to the hound
       *
       * @param d Distance to the hound
       */
      public void setDistance(int d){
	    distance = d;
      }

      /**
       * Returns the distance to the hound
       *
       * @return Distance to hound
       */
      public int getDistance(){
	    return distance;
      }

      /**
       * Returns wether the direction is diagonal
       *
       * @return True if direction to hound is diagonal
       */
      public boolean houndIsDiagonal(){
	    return ((direction == Direction.NE) ||
		    (direction == Direction.SE) ||
		    (direction == Direction.SW) ||
		    (direction == Direction.NW));
      }

      /**
       * Returns comparison of this hounddata to hd. The critirias are
       *
       * (1) Is this hound seen before hd
       * (2) Is this hound closer than hd
       * (3) Is this hounds direction "streight" or diagonal, compared to hd (diagonal < streight)
       *
       * @param hd Hounddata to be compared against
       * @return Difference to hd
       */
      public int compareTo(HoundData hd){
	    if(seen < hd.lastSeen()) return 1;
	    if(hd.lastSeen() < seen) return -1;

	    if(distance < hd.getDistance()) return 1;
	    if(hd.getDistance() < distance) return -1;

	    if((direction == Direction.N) ||
	       (direction == Direction.E) ||
	       (direction == Direction.S) ||
	       (direction == Direction.W)){
		  if((hd.getDirection() == Direction.N) ||
		     (hd.getDirection() == Direction.E) ||
		     (hd.getDirection() == Direction.S) ||
		     (hd.getDirection() == Direction.W))
			return 0;
		  else
			return 1;
	    }
	    else{
		  if((hd.getDirection() == Direction.N) ||
		     (hd.getDirection() == Direction.E) ||
		     (hd.getDirection() == Direction.S) ||
		     (hd.getDirection() == Direction.W))
			return -1;
		  else
			return 0;
	    }
      }
}
