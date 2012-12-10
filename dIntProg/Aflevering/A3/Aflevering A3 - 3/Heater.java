
/**
 * Øvelse 2.83. Aflevering A3, 3.
 * 
 * @author Susie 
 * @version 13.09.07
 */
public class Heater
{
    // The heaters temperature.
    private int temperature;
    private int min;
    private int max;
    private int increment;

    /**
     * Create an objekt of the class Heater with
     * a set temperature of 15 degrees.
     */
    public Heater(int setMin, int setMax)
    {
        temperature = 15;
        min = setMin;
        max = setMax;
        increment = 5;
    }
    
    /**
     * Increase the temperature by 5 degrees.  
     */
    public void warmer()
    {
        if ((temperature + increment) <= max) {
            temperature = temperature + increment;
        }
        else {
            temperature = max;
        }
    }
        
    /**
     * Decrease the temperature by 5 degrees.
     */
    public void cooler()
    {
        if ((temperature - increment) >= min) {
            temperature = temperature - increment;
        }
        else {
            temperature = min;
        }
    }
    
    /**
     * = the value of temperature.
     */
    public int getTemperature()
    {
        return temperature;
    }
    
    /**
     * Set the value for incrementation. 
     */
    public void setIncrement(int newIncrement)
    {
        if (newIncrement >= 0) {
            increment = newIncrement;
        }
        else {
            increment = increment;
        }
    }
}
