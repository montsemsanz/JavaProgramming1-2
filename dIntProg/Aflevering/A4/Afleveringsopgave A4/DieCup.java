import java.util.*;
/**
 * DieCup - a cup containing two or more dice.
 * 
 * @author Susie 
 * @version den endelige version, 22.09.07
 */
public class DieCup
{
    private ArrayList<Die> dice;
    private int eyes;
    private int numberOfDice;

    /**
     * Create two dies in a dieCup
     */
    public DieCup() {
        dice = new ArrayList<Die>();
        dice.add(new Die());
        dice.add(new Die());
        eyes = 0;
    }
    
    /**
     * Create n dies in a dieCup
     */
    public DieCup(int n) {
        numberOfDice = n;
        dice = new ArrayList<Die>(n);
        eyes = 0;
        for(int i = 0; i < n; i++) {
            dice.add(new Die());
        }        
        
    }
    
    /**
     * Throw the dice in the DieCup 
     */
    public void throwDice() {
        for(Die die : dice) {
            die.throwDie();
        }   
    }
    
    /**
     * Return the number of eyes in the DieCup 
     */
    public int getEyes() {
        int eyes = 0;
        
        for(Die die : dice) {
            eyes = eyes + die.getEyes();
        }
        
        return eyes;
    }
    
}
