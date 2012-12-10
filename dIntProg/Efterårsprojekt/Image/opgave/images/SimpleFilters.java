import java.util.*;
/**
 * SimpleFilters.
 * 
 * @author Susie 
 * @version 1. version, 02.10.07.
 */
public class SimpleFilters
{
    private Image image;
               
    /**
     * Create a simple filter for changing appearance of image.
     */
    public SimpleFilters()
    {
        image = new Image("strand.jpg");
    }

    /**
     * Brighten the image by a given factor.
     * param@ factor
     * 
     */
    public void brighten (int factor)
    {
        for(Pixel p : image.getPixels()) {
            p.setValue(p.getValue() + factor);
        }    
        image.pixelsUpdated();
    }
        
    /**
     * Darken the image by a given factor.
     * param@ factor
     */
    public void darken(int factor)
    {
        for(Pixel p : image.getPixels()) {
            p.setValue(p.getValue() - factor); 
        }
        image.pixelsUpdated();
    }
    
    /**
     * Invert the image - reversing the value of each pixel.
     */
    public void invert()
    {
        for(Pixel p : image.getPixels()) {
            p.setValue(255 - p.getValue());
        }
        image.pixelsUpdated();
    }
    
    /**
     * Solarize the image - inverting all pixels with value below 127.
     */
    public void solarize()
    {
        ArrayList<Pixel> valueLow = new ArrayList<Pixel>(); 
        for(Pixel p : image.getPixels()) {
            if(p.getValue() < 127) {
                valueLow.add(p);
            }
        }
        for(Pixel p1 : valueLow) {
            p1.setValue(255 - p1.getValue());
        }
        image.pixelsUpdated();
    }
    
}