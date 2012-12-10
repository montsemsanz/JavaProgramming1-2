package media;
import java.awt.*;
import java.awt.event.*;

/**
 * <em>ImagePresenter</em> er en applet baseret abstrakt klasse, 
 * nedarvet fra Presenter, som er specialiseret til at vise 
 * pr�sentationer med billeder.</p>
 * 
 * <p>Vinduet viser:</p>
 *
 * <ol>
 * <li> Et "kompas" med fire knapper svarende til kompasretningerne.
 * <li> Et grafisk billede
 * <li> Et tekstvindue.
 * </ol>
 *
 * <p>Meningen er, at pr�sentationen skal pr�sentere et antal fysiske rum, 
 * som er forbundne i de fire kompasretninger nord, syd, �st, og vest.
 * Hvert rum skal pr�senteres med et billede og en tekstuel beskrivelse.
 * Man kan s� g� fra et rum til et andet ved at trykke p� de fire
 * knapper i kompasset.</p>
 * 
 * <p>Presenter er et <em>framework</em>, dvs. det ejer h�ndelsesl�kken.
 * Brugere af klassen skal specialisere metoderne <code>init</code>
 * samt de fire metoder svarende til de fire knapper for 
 * kompasretningerne.</p>
 *
 * @see media.Presenter
 * @see media.ImageCanvas
 * @see java.applet.Applet
 *
 * @author Erik Martino, revideret af Erik Ernst
 * @version 2000?, November 2004
 */

public abstract class ImagePresenter extends Presenter
                                     implements ActionListener
{

    /** 
     * Returner et ImageCanvas, som kan bruges til at vise billeder i
     * denne pr�sentation.
     * @return En instans af et ImageCanvas
     * @see media.ImageCanvas
     */
    public Component createCenterComponent() {
        return new ImageCanvas();
    }
    
    /**
     * Viser et billede, det skaleres og centreres s� det passer
     * ind. Billederne skal ligge i samme directory som html
     * filen. 
     * @param filename Navnet p� filen som indeholder billedet. JPG og GIF
     * billeder er acceptable formater. Filnavnet m� <em>ikke</em> indeholde 
     * et stinavn.
     */
    public void showImage(String filename) throws java.io.FileNotFoundException
    {
        Image im = getImage(getDocumentBase(),filename);
        mt.addImage(im,0);
        try { 
            mt.waitForID(0); 
        } catch(InterruptedException e) {
            // no action
        }
        if(mt.isErrorID(0)) {
            throw new java.io.FileNotFoundException(filename);
        }
        ((ImageCanvas)centerComponent).setImage(im);
    }
}
