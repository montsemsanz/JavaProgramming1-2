import java.util.*;
/**
 * Write a description of class Picture here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Picture implements Comparable<Picture>
{
    private int wResolution;
    private int hResolution;
    private int size;

    /**
     * Constructor for objects of class Picture
     */
    public Picture(int w, int h, int s)
    {
        wResolution = w;
        hResolution = h;
        size = s;
    }

    /**
     *  
     */
    public String toString()
    {
        return (" w: " + wResolution + ", " + " h: " + hResolution + 
        ", " + " size: " + size + " kb ");
    }
    
    /**
     * 
     */
    public int getWResolution()
    {
        return wResolution;
    } 
    
    /**
     * 
     */
    public int getSize()
    {
        return size;
    }
    
    /**
     * 
     */
    public void compareTo(Picture p)
    {
        int result = 0;
        if(getWResolution() > p.getWResolution()) {
            result = 1;
        }
        if(getWResolution() < p.getWResolution()) {
            result = -1;
        }
        if(getWResolution() == p.getWResolution()) {
            result = 0;
        }
        return result;
    }
    
    
}
 