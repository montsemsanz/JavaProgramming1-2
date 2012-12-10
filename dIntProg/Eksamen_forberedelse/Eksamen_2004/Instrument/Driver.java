
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
        Instrument i2 = new Instrument("4-strenget basguitar", 8000);
        Instrument i3 = new Instrument("4-strenget akustisk guitar", 8000);
//      
//         System.out.println(i1 + "\n" + i2);
//         
        Musician m1 = new Musician();
        m1.addInstrument(i1);
        m1.addInstrument(i2);
        m1.addInstrument(i3);
        
//         System.out.println("Mest værdifulde instrument: " +
//         m1.findMostValuable());
//         
        m1.orderByValue();
        
    }
}
