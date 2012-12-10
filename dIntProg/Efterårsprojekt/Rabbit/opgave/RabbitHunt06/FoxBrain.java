import java.util.*;

/**
 * The brain of a fox.
 * 
 * @author David Matuszek
 * @author Martin Geisler
 * @author Mikkel Kroeigaard
 * @author Casper Torndahl
 * @version Januar 25, 2006
 */
public class FoxBrain extends Brain {

      // instance variables
      private boolean haveSeenRabbit = false;
      private boolean canSeeRabbitNow = false;
      private int distanceToRabbit;
      private Direction directionToRabbit;
      private Direction currentDirection;

      /**
       * Creates a new fox brain.
       * @param w the world in which the fox lives
       */
      public FoxBrain() {
	    currentDirection = Direction.randomDirection();
      }
    
      /**
       * Controls the movement of the fox.
       * @return the direction in which the fox wishes to move
       */
      public Direction decideMove() {
	    Observation obs;

	    // look all around for rabbit
	    canSeeRabbitNow = false;
	    for (Direction direction: Direction.DIRECTIONS) {
		  obs = world.look(direction);
		  if (obs.getObject() == World.RABBIT) {
			canSeeRabbitNow = true;
			haveSeenRabbit = true;
			directionToRabbit = direction;
			distanceToRabbit = obs.getDistance();
		  }
	    }
        
	    // if rabbit has been seen recently (not necessarily this time),
	    // move toward its last known position
	    if (haveSeenRabbit) {
		  if (distanceToRabbit > 0) {
			distanceToRabbit--;
			return directionToRabbit;
		  }
		  else { // rabbit was here--where did it go?
			haveSeenRabbit = false;
			currentDirection = Direction.randomDirection();
		  }
	    }
        
	    // either haven't seen rabbit, or lost track of rabbit
	    // continue with current direction, maybe dodging bushes
	    if (world.canMove(currentDirection)){
		  return currentDirection;
	    }
	    else if (world.canMove(Direction.turn(currentDirection, 1)))
		  return Direction.turn(currentDirection, 1);
	    else if (world.canMove(Direction.turn(currentDirection, -1)))
		  return Direction.turn(currentDirection, -1);
	    else {
		  currentDirection = Direction.randomDirection();
		  for (int i = 0; i < 8; i++) {
			if (world.canMove(currentDirection))
			      return currentDirection;
			else
			      currentDirection = Direction.turn(currentDirection, 1);
		  }
	    }
	    // stuck! cannot move
	    return Direction.NONE;
      }
}
