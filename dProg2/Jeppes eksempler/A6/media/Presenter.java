package media;
import java.awt.*;
import java.awt.event.*;

/**
 * 
 * <em>Presenter</em> er en applet baseret abstrakt klasse, 
 * som i et vindue viser:
 * <ol>
 * <li> Et "kompas" med fire knapper svarende til kompasretningerne.
 * <li> En centerkomponent - denne skal defineres i specialiserede klasser
 * <li> Et tekstvindue.
 * </ol>
 * Pr�sentationens basale ide er at brugeren vha. af kompasknapperne kan
 * styre et objekt/pr�sentation som vises i midten af vinduet. Dette
 * objekt/pr�sentation er ikke specificeret i denne klasse; det er op
 * til de specialiserende klasser at definere dette. Se f.eks. ImagePresenter
 * som giver et fornuftigt eksempel. Supplerende tekst kan vises i
 * tekstvinduet forneden.
 * <p>
 * Presenter er et <em>framework</em>, dvs. det ejer h�ndelsesl�kken.
 * Brugere af klassen skal specialisere metoderne <code>init</code>
 * samt de fire metoder svarende til de fire knapper for kompasretningerne.
 * Endelig skal center komponentens indhold defineres i metoden
 * <code>createCenterComponent</code>.
 *
 */

public abstract class Presenter 
  extends java.applet.Applet 
  implements ActionListener
{
  protected Component centerComponent;
  protected TextArea ta;
  protected MediaTracker mt = new MediaTracker(this);

  /** Initialisering af appletten. Skal specialiseres til at s�tte
   * brugersystemet op.
   */
  public abstract void init();
	
  /** S�tter det grafiske layout op */
  public Presenter()
  {
    setBackground( Color.white );

    // Overordnet fremst�r vinduet som et border layout
    setLayout( new BorderLayout() );

    // Kompasset ligger i sit eget panel i NORTH.
    // Der bruges en GridBagLayout for at lave et layout som ligner
    // et kompas s�dan nogenlunde.
    Panel compass = new Panel();
    compass.setLayout( new GridBagLayout() );

    Button north, south, east, west;
		
    GridBagConstraints c = new GridBagConstraints();
    c.fill = GridBagConstraints.NONE;
    c.insets = new Insets(2,2,2,2);
    c.weightx = 0.0; c.weighty = 0.0;

    c.gridx = 1; c.gridy = 0;
    c.gridwidth = GridBagConstraints.REMAINDER; c.gridheight = 1;
    compass.add(north = new Button("North"), c);

    c.gridx = 0; c.gridy = 1;
    c.gridwidth = GridBagConstraints.RELATIVE; c.gridheight = 1;
    compass.add(west = new Button("West"), c);

    c.gridx = 2; c.gridy = 1;
    c.gridwidth = GridBagConstraints.REMAINDER; c.gridheight = 1;
    compass.add(east = new Button("East"), c);

    c.gridx = 1; c.gridy = 2;
    c.gridwidth = GridBagConstraints.REMAINDER; c.gridheight = 1;
    compass.add(south = new Button("South"), c);

    add(compass,BorderLayout.NORTH);

    // S�t knapperne op til at lytte p� mouse events.
    north.addActionListener(this);
    south.addActionListener(this);
    east.addActionListener(this);
    west.addActionListener(this);

    // Centerdelen skal defineres i subklasser, vi l�gger den ind
    // i et panel med et cardlayout, dvs. den centrale del
    // kommer til at fylde maksimalt i panel.
    Panel theFrame = new Panel( new CardLayout(2,2) );
    theFrame.setBackground( new Color( 200, 200, 200 ) );
    add( theFrame, BorderLayout.CENTER );
    // Skab selve center komponenten.
    centerComponent = createCenterComponent();
    // centerComponent.setSize( 200, 200 );
    theFrame.add( "none", centerComponent );
    // theFrame.add( new Button( "TESTING" ) );

    // Endelig sidder tekstdelen i SOUTH
    ta = new TextArea("",5,30,TextArea.SCROLLBARS_NONE);
    add(ta,BorderLayout.SOUTH);
  }

  /**
   * Denne metode skal overskrives til at returnere en instans
   * af Component, der bliver indsat i midten af pr�sentationen.
   * @return Instans af den component, der skal vises i midten.
   */
  public abstract Component createCenterComponent();

  /**
   * Denne metoder bliver kaldt, n�r der trykkes p� knappen "North".
   */
  public abstract void northButtonPressed();
  /**
   * Denne metoder bliver kaldt, n�r der trykkes p� knappen "South".
   */
  public abstract void southButtonPressed();
  /**
   * Denne metoder bliver kaldt, n�r der trykkes p� knappen "East".
   */
  public abstract void eastButtonPressed();
  /**
   * Denne metoder bliver kaldt, n�r der trykkes p� knappen "West".
   */
  public abstract void westButtonPressed();

  /** H�ndtering af mouse events. 
   * Denne metode skal <em>ikke</em> overskrives! */
  public void actionPerformed(ActionEvent e) {
    String arg = e.getActionCommand();
    if(arg.equals("North")) northButtonPressed();
    else if(arg.equals("South"))southButtonPressed();
    else if(arg.equals("East")) eastButtonPressed();
    else if(arg.equals("West")) westButtonPressed();
  }

  /**
   * S�tter teksten i tekstvinduet forneden.
   * @param text Den tekst, som skal vises i textomr�det.
   */
  public void showText(String text) {
    ta.setText(text);	
  }	
}