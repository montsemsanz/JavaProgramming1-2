
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    public static void exam()
    {
        Instrument i1 = new Instrument("12-strenget guitar", 12500);
        Instrument i2 = new Instrument("El-klaver", 19500);
        
        System.out.println(i1 + "\n" + i2);
        
        Musician m = new Musician();
        m.addInstrument(i1);
        m.addInstrument(i2);
        
        System.out.println("Det mest værdifulde instrument: " + "\n" +
        " " + m.findMostValuable());
        
        System.out.println("Instrumenter ordnet efter værdi og beskrivelse: ");
        m.sortInstruments();
        
    }
        
}
