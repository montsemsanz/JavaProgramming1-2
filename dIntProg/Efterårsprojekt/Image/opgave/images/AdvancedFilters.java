import java.util.*;
/**
 * AdvancedFilter is the name of a class designed to mirror, flip,
 * rotate or blur the image.
 * 
 * @author Susie
 * @version 1. version, 03.10.07.
 */
public class AdvancedFilters
{
    private Image image;
    private Image imageMirror;
    private Image imageFlipped;
    private Image imageRotate;
    private Image imageBlurred;
            
    /**
     * Create an AdvancedFilter.
     */
    public AdvancedFilters()
    {
        image = new Image("strand.jpg");
    }

    /**
     * Mirroring the image - reversing value of pixels along the vertical axis (i).
     */
    public Image mirror()
    {
        imageMirror = new Image(image.getWidth(), image.getHeight(), "ImageMirror");
        for(int i = 0; i < image.getWidth(); i++)
            for(int j = 0; j < image.getHeight(); j++)
            {
                Pixel p = image.getPixel(i, j);
                int pixelValue = p.getValue();
                Pixel p1 = imageMirror.getPixel((image.getWidth() - i - 1), j);
                p1.setValue(pixelValue);
            }
               
        return imageMirror;
    }
    
    /**
     * Flipping the image - reversing value of pixels along the horizontal axis (j). 
     */
    public Image flip()
    {
        imageFlipped = new Image(image.getWidth(), image.getHeight(), "ImageFlipped");
        for(int i = 0; i < image.getWidth(); i++)
            for(int j = 0; j < image.getHeight(); j++)
            {
                Pixel p = image.getPixel(i, j);
                int pixelValue = p.getValue();
                Pixel p1 = imageFlipped.getPixel(i, (image.getHeight() - j - 1));
                p1.setValue(pixelValue);
            }
               
        return imageFlipped;
    }
    
    /**
     * Rotating the image - 90 degrees in the counter clockwise direction.
     */
    public Image rotate()
    {
        imageRotate =  new Image(image.getHeight(), image.getWidth(), "ImageRotate");
        for(int i = 0; i < image.getWidth(); i++)
            for(int j = 0; j < image.getHeight(); j++)
            {
                Pixel p = image.getPixel(i, j);
                int pixelValue = p.getValue();
                Pixel p1 = imageRotate.getPixel(j, (image.getWidth() - 1 - i));
                p1.setValue(pixelValue);
            }
            
        return imageRotate;
    }
    
    /**
     * Average - calculates the average value of a cluster of pixels.
     */
    public List<Pixel> average(int i, int j)
    {
        Pixel p = image.getPixel(i, j);
        return image.getNeighbours(i, j);
    }
    
    /**
     * Blurred - 
     */ 
    public Image blur()
    {
        return imageBlurred;
    }
        
}
