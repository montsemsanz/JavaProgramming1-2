
/**
 * DieCup - a cup containing two dice.
 * 
 * @author Susie 
 * @version 20.09.07
 */
public class DieCup
{
    private Die d1;
    private Die d2;
    private int eyes;

    /**
     * Create two dices in a dieCup
     */
    public DieCup() {
        d1 = new Die();
        d2 = new Die();
        eyes = 0;
    }

    /**
     * Throw the dice in the DieCup 
     */
    public void throwDice() {
        d1.throwDie(); 
        d2.throwDie();
    }
    
    /**
     * = the sum of eyes on the dice. 
     */
    public int getEyes() { 
        eyes = d1.getEyes() + d2.getEyes();
        return eyes;
    }
}
