
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
        CinemaShow cs2 = new CinemaShow("Miraklet", "2003-07-14", "20:00", 287);
        CinemaShow cs3 = new CinemaShow("Drabet", "2005-10-24", "18:00", 312);
        CinemaShow cs4 = new CinemaShow("Miraklet", "2003-07-14", "18:00", 287);
        
        System.out.println(cs1 + "\n" + cs2);
        
        Cinema c = new Cinema("Grand Teater");
        c.add(cs1);
        c.add(cs2);
        c.add(cs3);
        c.add(cs4);
        
        System.out.println("Bedst besøgte film: " + "\n" +
        c.mostCrowded());
        
        System.out.println("Antal tilskuere til filmen Miraklet: " + "\n" + 
        c.spectators("Miraklet"));
        
        System.out.println("Liste over forestillinger ordnet efter kronologi");
        c.printCinemaShows();
    }
        
}
