import java.util.*;
/**
 * Write a description of class MemoryCard here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MemoryCard
{
    private String id;
    private ArrayList<Picture> pictures;

    /**
     * Constructor for objects of class MemoryCard
     */
    public MemoryCard(String i)
    {
        id = i;
        pictures = new ArrayList<Picture>();
    }

    /**
     * Add a picture to the list.
     * @ param Picture p
     */
    public void addPicture(Picture p)
    {
        pictures.add(p);
    }
    
    /**
     * Remove a picture from the list.
     * @ param Picture p
     */
    public void removePicture(Picture p)
    {
        pictures.remove(p);
    }
    
    /**
     * Return all the pictures with a given resolution on width.
     * @ param List<Picture>
     */
    public List<Picture> getAll(int wResolution)
    {
        List result = new ArrayList();
        for (Picture p : pictures) {
            if(p.getWResolution() == wResolution) {
                result.add(p);
            }
        }
        return result;
    }    
    
    /**
     * 
     */
    public Picture orderingPictures()
    {
        return Collections.min(pictures);
    }    
}
    
