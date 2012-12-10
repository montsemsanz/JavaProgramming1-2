import java.util.*;
/**
 * Write a description of class Musician here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Musician
{
    private List<Instrument> instruments;

    /**
     * Constructor for objects of class Musician
     */
    public Musician()
    {
        instruments = new ArrayList<Instrument>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void addInstrument(Instrument i)
    {
        instruments.add(i);
    }
    
    /**
     * 
     */
    public void removeInstrument(Instrument i)
    {
        instruments.remove(i);
    }
    
    /**
     * 
     */
    public Instrument findMostValuable()
    {
        Instrument mostValuableYet = instruments.get(0);
        for(Instrument i : instruments) {
            if(i.getValue() > mostValuableYet.getValue()) {
                mostValuableYet = i;
            }
        }
        return mostValuableYet;
    }
    
    /**
     * 
     */
    public void orderByValue()
    {
        Collections.sort(instruments);
        for(Instrument i : instruments) {
            System.out.print("\n" + i);
        }
    }
         
}
