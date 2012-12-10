
/**
 * Die Class. Throw a die and get number of eyes.
 * 
 * @author Susie 
 * @version den endelige version, 22.09.07
 */
import java.util.*;
public class Die
{
    // Field.
    private int eyes;
    private java.util.Random r;
    
    /**
     * Create a die with six possible outcomes.
     */
    public Die()
    {
     eyes = 0;
     r = new java.util.Random();
    }
    
    /**
     * obtain a new numer of eyes for this die. 
     */
    public void throwDie() {
        Random r;
        r = new Random();
        eyes = r.nextInt(6) +1;
    }

    /**
     * @the number of eyes for this die.
     */
    public int getEyes() {
        return eyes;
    }
}
