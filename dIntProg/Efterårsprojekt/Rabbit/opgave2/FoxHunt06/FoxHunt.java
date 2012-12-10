import java.util.*;

/**
 * Describes a "fox hunt", in which a hounds moves around a field
 * containing bushes, looking for a fox. The fox, of course,
 * tries not to be caught by the hounds.
 * 
 * @author David Matuszek
 * @author Casper Torndahl
 * @version Januar 24, 2006
 */
public class FoxHunt {

      /**
       * Main class for starting a fox hunt; no parameters
       * are needed or used. Number of hounds will be 1 and
       * bushes 10% of the board.
       */
      public static void standardGame() {
	    int numberOfRows    = 20;
	    int numberOfColumns = 20;

	    Model model = new Model(numberOfRows, numberOfColumns);
	    Controller controller = new Controller(model);
      }

      /**
       * Starts the foxhuntgame with random parameters
       *
       * Number of hounds is in (0, 5]
       * % of the board covered by bushes [0,20]
       */
      public static void randomGame(){
	    Random rand = new Random();
	    int numberOfRows    = 20;
	    int numberOfColumns = 20;
	    int hounds  = rand.nextInt(4)+1;
	    int bushes = rand.nextInt(20);

	    Model model = new Model(numberOfRows, numberOfColumns, hounds, bushes);
	    Controller controller = new Controller(model);
      }

      /**
       * Starts the foxhuntgame with userdefinesd parameters
       *
       * @param h Number of hounds
       * @param b % of the board covered by bushes (Max. 60% allowed)
       */
      public static void userDefinedGame(int h, int b){
	    int numberOfRows    = 20;
	    int numberOfColumns = 20;
	    
	    if(60 < b) b = 60;

	    Model model = new Model(numberOfRows, numberOfColumns, h, b);
	    Controller controller = new Controller(model);
      }

      public static void main(String[] args){
	    standardGame();
      }
}
