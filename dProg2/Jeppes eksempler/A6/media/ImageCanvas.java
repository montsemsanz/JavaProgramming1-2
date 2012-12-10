package media;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * Kan vise et billede skaleret så det passer i størrelse til den
 * plads der er til rådighed. Det er ikke meningen at denne klasse
 * skal bruges direkte.
 * @see ioop.media.Presenter
 *
 * @author Erik Martino &lt;<A href="mailto:martino@daimi.au.dk">martino@daimi.au.dk</A>>
 * 
 *  */

public class ImageCanvas extends Canvas {
	Image picture;
	
	public void setImage(Image im)
	{
		picture = im; /* im skal vaere loaded i forvejen */
		repaint();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		if(picture != null) {
			Dimension d = getSize();
			int w = picture.getWidth(null);
			int h = picture.getHeight(null);
			double wscale = (double)d.width/(double)w;
			double hscale = (double)d.height/(double)h;
			double scale = wscale < hscale ? wscale : hscale ;
			
			scale = scale > 1 ? 1 : scale; // if we are only allowed to scale down
			int w2 = (int)(w*scale);
			int h2 = (int)(h*scale);
			
			g.drawImage(picture,(d.width-w2)/2,(d.height-h2)/2,w2,h2,null);
		}
	}
}
/* Local Variables: */
/* mode: java */
/* tab-width: 2 */
/* End: */