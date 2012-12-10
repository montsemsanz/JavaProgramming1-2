import java.util.*;
/**
 * Write a description of class Cinema here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cinema
{
    private String cinemaName;
    private List<CinemaShow> shows;

    /**
     * Constructor for objects of class Cinema
     */
    public Cinema(String cN)
    {
        cinemaName = cN;
        shows = new ArrayList<CinemaShow>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(CinemaShow cs)
    {
        shows.add(cs);
    }
    
    /**
     * 
     */ 
     public void remove(CinemaShow cs)
     {
         shows.remove(cs);
     }
     
     /**
      * 
      */ 
     public CinemaShow mostCrowded()
     {
         CinemaShow mostCrowdedYet = shows.get(0);
         for(CinemaShow cs : shows) {
             if(cs.getSpectators() > mostCrowdedYet.getSpectators()) {
                 cs = mostCrowdedYet;
             }
         }
         return mostCrowdedYet;
     }
     
     /**
      * 
      */
     public int spectators(String movie)
     {
         int result = 0;
         for(CinemaShow cs : shows) {
             if(movie.equals(cs.getMovie())) {
                 result = cs.getSpectators();
             }
         }
         return result;
     }
     
     /**
      * 
      */ 
     public void printCinemaShows()
     {
         Collections.sort(shows);
         for(CinemaShow cs : shows) {
             System.out.println(" " + cs);
         }
     }
      
             
                 
}
