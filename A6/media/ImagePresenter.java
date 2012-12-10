package media;
import java.awt.*;
import java.awt.event.*;

/**
 * 
 * <em>ImagePresenter</em> er en applet baseret abstrakt klasse, 
 * nedarvet fra Presenter, som er specialiseret til at vise 
 * præsentationer med billeder.
 * <p>
 * Vinduet viser:
 * <ol>
 * <li> Et "kompas" med fire knapper svarende til kompasretningerne.
 * <li> Et grafisk billede
 * <li> Et tekstvindue.
 * </ol>
 * Meningen er, at
 * præsentationen skal præsentere et antal fysiske rum, som er
 * forbundne i de fire kompasretninger nord, syd, øst, og vest.
 * Hvert rum skal præsenteres med et billede og en tekstuel beskrivelse.
 * Man kan så gå fra et rum til et andet ved at trykke på de fire
 * knapper i kompasset.
 * <p>
 * Presenter er et <em>framework</em>, dvs. det ejer hændelsesløkken.
 * Brugere af klassen skal specialisere metoderne <code>init</code>
 * samt de fire metoder svarende til de fire knapper for kompasretningerne.
 *
 * @see media.Presenter
 * @see media.ImageCanvas
 * @see java.applet.Applet
 * @version 1.1
 */

public abstract class ImagePresenter 
  extends Presenter
  implements ActionListener
{

  /** Returner et ImageCanvas, som kan bruges til at vise billeder i
   * denne præsentation.
   * @return En instans af et ImageCanvas
   * @see media.ImageCanvas
   */
  public Component createCenterComponent() {
    return new ImageCanvas();
  }
  
  /**
   * Viser et billede, det skaleres og centreres så det passer
   * ind. Billederne skal ligge i samme directory som html
   * filen. 
   * @param filename Navnet på filen som indeholder billedet. JPG og GIF
   * billeder er acceptable formater. Filnavnet må <em>ikke</em> indeholde 
   * et stinavn.
   */
  public void showImage(String filename) throws java.io.FileNotFoundException {
    Image im = getImage(getDocumentBase(),filename);
    mt.addImage(im,0);
    try { mt.waitForID(0); } catch(InterruptedException e) { }
    if(mt.isErrorID(0)) {
      throw new java.io.FileNotFoundException(filename);
    }
    ((ImageCanvas) centerComponent).setImage(im);
  }

}