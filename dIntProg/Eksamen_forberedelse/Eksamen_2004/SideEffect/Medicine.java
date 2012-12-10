import java.util.*;
/**
 * Write a description of class Medicine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medicine
{
    private String name;
    private List<SideEffect> bivirkninger;

    /**
     * Constructor for objects of class Medicine
     */
    public Medicine(String n)
    {
        name = n;
        bivirkninger = new ArrayList<SideEffect>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void addSideEffect(SideEffect s)
    {
        bivirkninger.add(s);
    }
    
    /**
     * 
     */
    public void removeSideEffect(SideEffect s)
    {
        bivirkninger.remove(s);
    }
    
    /**
     * 
     */
    public int totalRisc()
    {
        int total = 0;
        for(SideEffect s : bivirkninger) {
            total = total + s.getRiscLevel();
        }
        return total;
    }
    
    /**
     * 
     */
    public SideEffect worstSideEffect()
    {
        SideEffect worstSoFar = bivirkninger.get(0);
        for(SideEffect s : bivirkninger) {
            if(s.getRiscLevel() > worstSoFar.getRiscLevel()) {
                worstSoFar = s;
            }
        }
        return worstSoFar;
    }
}
