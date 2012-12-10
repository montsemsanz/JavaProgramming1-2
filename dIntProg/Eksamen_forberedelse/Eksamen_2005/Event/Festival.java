import java.util.*;

/**
 * Write a description of class Festival here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Festival
{
    private List<Event> events;

    /**
     * Constructor for objects of class Festival
     */
    public Festival()
    {
        events = new ArrayList<Event>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(Event e)
    {
        events.add(e);
    }
    
    /**
     * 
     */
    public void remove(Event e)
    {
        events.remove(e);
    }
    
    /**
     * 
     */
    public int noOfEvents(String date)
    {
        int total = 0;
        for(Event e : events) {
            if(date == e.getDate()) {
                total = total + 1;
            }
        }
        return total;
    }
    
    /**
     * 
     */
    public List<Event> find(String kind)
    {
        List<Event> certainTypeEvent = new ArrayList<Event>();
        for(Event e : events) {
            if(kind == e.getKind()) {
                certainTypeEvent.add(e);
            }
        }
        return certainTypeEvent;
    }
    
    /**
     * 
     */
    public void printEvents()
    {
        Collections.sort(events);
        for(Event e : events) {
            System.out.println(e);
        }
    }

}
