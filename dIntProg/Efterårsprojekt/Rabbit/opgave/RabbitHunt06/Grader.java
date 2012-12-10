import java.awt.*;

/**
 * Executes a number of "rabbit hunts", in which a fox moves around a field
 * containing bushes, looking for a rabbit, and prints out the percentage
 * of times that the rabbit escapes.
 * 
 * @author David Matuszek
 * @version October 24, 2001
 */
public class Grader {

    static final int NUMBER_OF_TRIALS = 1000;
    
    // class variables
    private static Model model;
    private static Controller controller;
    private static int numberOfRows;
    private static int numberOfColumns;

    /**
     * Main class for starting rabbit hunts and counting games.
     */
    public static void main() {
        numberOfRows = numberOfColumns = 20;
        model = new Model(numberOfRows, numberOfColumns);
        countGames();
    }
    
    /**
     * Runs NUMBER_OF_TRIALS rabbit hunts, and prints out the
     * results as a percentage of times the rabbit escapes.
     */
    private static void countGames() {
    
        int totalSteps = 0;
        int minSteps = Integer.MAX_VALUE;
        int maxSteps = 0;

        for (int i = 0; i < NUMBER_OF_TRIALS; i++) {
            model.reset();
            while (!model.gameIsOver()) {
                model.allowSingleMove();
            }

            totalSteps += model.stepsTaken();
            
            minSteps = Math.min(minSteps, model.stepsTaken());
            maxSteps = Math.max(maxSteps, model.stepsTaken());
        }
        
        System.out.printf("Rabbit survives for %.2f steps on average " +
                          "(%d to %d steps)%n",
                          (double)totalSteps/NUMBER_OF_TRIALS,
                          minSteps, maxSteps);

    }
}
