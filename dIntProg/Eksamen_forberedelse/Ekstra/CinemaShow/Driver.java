
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
        CinemaShow cs1 = new CinemaShow("Drabet", "2005-10-24", "21:15", 312);
        CinemaShow cs2 = new CinemaShow("Mordet", "2003-07-18", "20:00", 279);
        
        System.out.println(cs1 + "\n" + cs2);
        
        Cinema c = new Cinema("Cinemax");
        c.add(cs1);
        c.add(cs2);
        
        System.out.println("Den mest besøgte forestilling: " + "\n" +
        " " + c.mostCrowded());
        
        System.out.println("Antak tilskuere til filmen Mordet: " + "\n" +
        " " + c.spectators("Mordet"));
    }
        
}
