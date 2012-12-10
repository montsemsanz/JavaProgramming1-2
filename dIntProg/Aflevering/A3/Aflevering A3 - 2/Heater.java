
/**
 * Øvelse 2.82. Heater Aflevering A3, 2.
 * 
 * @author Susie 
 * @version 13.09.07
 */
public class Heater
{
    // The heaters temperature.
    private int temperature;

    /**
     * Create an objekt of the class Heater with
     * a set temperature of 15 degrees.
     */
    public Heater()
    {
        temperature = 15;
    }
    
    /**
     * Increase the temperature by 5 degrees.  
     */
    public void warmer()
    {
        temperature = temperature + 5;
    }
    
    /**
     * Decrease the temperature by 5 degrees.
     */
    public void cooler()
    {
        temperature = temperature - 5;
    }
    
    /**
     * = the value of temperature.
     */
    public int getTemperature()
    {
        return temperature;
    }
}
