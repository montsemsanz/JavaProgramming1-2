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
        return Collections.max(instruments, new ValueComparator());
    }
    
    /**
     * 
     */
    public void sortInstruments()
    {
        Collections.sort(instruments);
        for(Instrument i : instruments) {
            System.out.println(" " + i);
        }
    }
        
}
