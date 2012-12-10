package media;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * ImageCanvas viser et billede skaleret så det passer i størrelse til den
 * plads der er til rådighed.  Det er ikke meningen at denne klasse
 * skal bruges direkte.
 * @see ioop.media.Presenter
 *
 * @author Erik Martino, revideret af Erik Ernst
 * @version 2000?, November 2004
 */

public class ImageCanvas extends Canvas 
{
    Image picture;
    
    public void setImage(Image im) 
    {
        picture = im; /* im skal vaere loaded i forvejen */
        repaint();
    }
  
    public void paint(Graphics g) 
    {
        super.paint(g);
        if(picture != null) {
            Dimension d = getSize();
            int w = picture.getWidth(null);
            int h = picture.getHeight(null);
            double wscale = (double)d.width/(double)w;
            double hscale = (double)d.height/(double)h;
            double scale = wscale < hscale ? wscale : hscale ;
            
            scale = scale > 1 ? 1 : scale; // if only allowed to scale down
            int w2 = (int)(w*scale);
            int h2 = (int)(h*scale);
            
            g.drawImage(picture,(d.width-w2)/2,(d.height-h2)/2,w2,h2,null);
        }
    }
}
