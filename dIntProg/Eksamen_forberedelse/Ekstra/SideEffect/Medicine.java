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
    private List<SideEffect> sideeffects;
    /**
     * Constructor for objects of class Medicine
     */
    public Medicine(String n)
    {
        name = n;
        sideeffects = new ArrayList<SideEffect>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void addSideEffect(SideEffect s)
    {
        sideeffects.add(s);
    }
    
    /**
     * 
     */
    public void removeSideEffect(SideEffect s)
    {
        sideeffects.remove(s);
    }
    
    /**
     * 
     */
    public int totalRisc()
    {
        int total = 0;
        for(SideEffect s : sideeffects) {
            total = total + s.getRiscLevel();
        }
        return total;
    }
    
    /**
     * 
     */
    public SideEffect worstSideEffect()
    {
        return Collections.max(sideeffects);
    }
}
