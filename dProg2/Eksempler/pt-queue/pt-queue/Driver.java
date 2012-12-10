import java.util.*;

/**
 * Client program for PTQueue.
 * 
 * @author Micihael E. Caspersen 
 * @version 2 November 2007
 */
public class Driver {

    public static void run() {
        PTQueue<String> ptq= new PTQueueList<String>();
        
        ptq.add("det").add("var").add("en").add("loerdag").add("aften");
        System.out.println("Det mindste ord i titlen 'det var en loerdag aften' er:");
        System.out.println("  " + ptq.min());
        System.out.println();

        List<String> sortedWords= new ArrayList<String>();
        while ( !ptq.isEmpty() ) {
            sortedWords.add(ptq.min());
            ptq.removeMin();
        }
        System.out.println("Den alfabetiske ordning af ordene i titlen er:");
        System.out.println("  " + sortedWords);
    }

}
