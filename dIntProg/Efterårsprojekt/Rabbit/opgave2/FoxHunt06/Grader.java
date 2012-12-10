import java.awt.*;

/**
 * Executes a number of "fox hunts", in which hounds moves around a field
 * containing bushes, looking for a fox, and prints out the percentage
 * of times that the fox escapes.
 * 
 * @author David Matuszek
 * @author Casper Torndahl
 * @version Januar 29, 2006
 */
public class Grader {

      static final int NUMBER_OF_TRIALS = 1000;
    
      // class variables
      private static Model model;
      private static Controller controller;
      private static int numberOfRows;
      private static int numberOfColumns;

      /**
       * Main class for starting fox hunts and counting games.
       */
      public static void main(String[] args) {
	    numberOfRows = numberOfColumns = 20;
	    //model = new Model(numberOfRows, numberOfColumns);
	    model = new Model(numberOfRows, numberOfColumns, 1, 10);
	    countGames();
	    model = new Model(numberOfRows, numberOfColumns, 2, 10);
	    countGames();
	    model = new Model(numberOfRows, numberOfColumns, 3, 10);
	    countGames();
	    model = new Model(numberOfRows, numberOfColumns, 4, 10);
	    countGames();
      }
    
      /**
       * Runs NUMBER_OF_TRIALS foxhunts, and prints out the
       * results as a percentage of times the fox escapes.
       */
      private static void countGames() {
    
	    int totalSteps = 0;
	    int minSteps = Integer.MAX_VALUE;
	    int maxSteps = 0;

	    for (int i = 0; i < NUMBER_OF_TRIALS; i++) {
		  model.reset();
		  while ((!model.gameIsOver()) && (model.stepsTaken() < 1000)) {
			model.allowSingleMove();
		  }

		  totalSteps += model.stepsTaken();
            
		  minSteps = Math.min(minSteps, model.stepsTaken());
		  maxSteps = Math.max(maxSteps, model.stepsTaken());
	    }

	    System.out.printf("Fox survives for %.2f steps on average of %d trials (%d to %d steps)%n",
			      (double)totalSteps/NUMBER_OF_TRIALS, NUMBER_OF_TRIALS, minSteps, maxSteps);

      }
}
