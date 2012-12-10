import java.util.*;

/**
 * Describes a "rabbit hunt", in which a fox moves around a field
 * containing bushes, looking for a rabbit. The rabbit, of course,
 * tries not to be caught by the fox.
 * 
 * @author David Matuszek
 * @author Casper Torndahl
 * @version Januar 24, 2006
 */
public class RabbitHunt {

      /**
       * Main class for starting a rabbit hunt; no parameters
       * are needed or used. Number of foxes will be 1 and
       * bushes 10% of the board.
       */
      public static void standardGame() {
	    int numberOfRows    = 20;
	    int numberOfColumns = 20;

	    Model model = new Model(numberOfRows, numberOfColumns);
	    Controller controller = new Controller(model);
      }

      /**
       * Starts the rabbithuntgame with random parameters
       *
       * Number of fozes is in (0, 5]
       * % of the board covered by bushes [0,20]
       */
      public static void randomGame(){
	    Random rand = new Random();
	    int numberOfRows    = 20;
	    int numberOfColumns = 20;
	    int foxes  = rand.nextInt(4)+1;
	    int bushes = rand.nextInt(20);

	    Model model = new Model(numberOfRows, numberOfColumns, foxes, bushes);
	    Controller controller = new Controller(model);
      }

      /**
       * Starts the rabbithuntgame with userdefinesd parameters
       *
       * @param f Number of foxes
       * @param b % of the board covered by bushes (Max. 60% allowed)
       */
      public static void userDefinedGame(int f, int b){
	    int numberOfRows    = 20;
	    int numberOfColumns = 20;
	    
	    if(60 < b) b = 60;

	    Model model = new Model(numberOfRows, numberOfColumns, f, b);
	    Controller controller = new Controller(model);
      }

      public static void main(String[] args){
	    standardGame();
      }
}
