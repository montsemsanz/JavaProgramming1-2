/**
 *  A very simple Calculator.
 *  @author  Martin Kristiansen
 *  @version 2007.08.23
 */
public class Calculator 
{

    // Fields
    private int value;


    /**
     * Creates a new Calculator object with zero in the accumulator.
     */
    public Calculator() 
    {
        value = 0;
    }


    /**
     * Returnes the current value of the calculator.
     * @return the accumulator's value
     */
    public int getValue() {
        return value;
    }


    /**
     * Sets the value new value.
     * @param val the new accumulator value
     */
    public void setValue(int val) {
        value = val;
    }



    /**
     * Add an amount val.
     * @param val the amount to add
     */
    public void add(int val) 
    {
        value = value + val;
    }


    /**
     * Subtracts an amount val from the Calculator.
     * @param val the amount to subtract
     */
    public void subtract(int val) 
    {
        value = value - val;
    }


    /**
     * Multiplies an amount val. 
     * @param val the amount to multiply
     */
    public void multiplyBy(int val) 
    {
        value = value * val;
    }

    /**
     * Divides an amount val.
     * @param val the amount to divide
     */ 
    public void divideBy(int val) 
    {
        value = value / val;
    }

}

