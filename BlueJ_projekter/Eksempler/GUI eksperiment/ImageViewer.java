import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ImageViewer is the main class of the image viewer application. It builds
 * and displays the application GUI and initialises all other components.
 * 
 * To start the application, create an object of this class.
 * 
 * @author Michael Kolling and David J Barnes 
 * @version 0.1
 */
public class ImageViewer 
{
    private JFrame frame;
    
    /**
     * Create an ImageViewer show it on screen.
     */
    public ImageViewer()
    {
        makeFrame();
    }
    
    // ---- swing stuff to build the frame and all its components ----
    
    /**
     * Create the Swing frame and its content.
     */
    private void makeFrame()
    {
        frame = new JFrame("ImageViewer");        
        Container contentPane = frame.getContentPane();
        
        makeMenuBar(frame);
        
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * 
     */
    private void makeMenuBar(JFrame frame)
    {
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        // Create the File Menu.
        JMenu fileMenu = new JMenu("File");
        menubar.add(fileMenu);
        
        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(new OpenActionListener());
        fileMenu.add(openItem);
                
        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(new QuitActionListener());
        fileMenu.add(quitItem);
        
        JMenuItem saveItem = new JMenuItem("Save");
        quitItem.addActionListener(new SaveActionListener());
        fileMenu.add(saveItem);
                
        // Create the Help Menu.
        JMenu helpMenu = new JMenu("Help");
        menubar.add(helpMenu);
        
        JMenuItem aboutItem = new JMenuItem("About ImageViewer");
        aboutItem.addActionListener(new AboutActionListener());
        helpMenu.add(aboutItem);
    }
    
    /**
     * 
     */
    private void openFile()
    {
    }
    
    /**
     * 
     */
    private void saveFile()
    {
    }
    
    /**
     * 
     */
    private void quit()
    {
    }
    
    /**
     * 
     */
    private void about()
    {
    }
    
    /**
     * 
     */
    class OpenActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getActionCommand().equals("Open")) {
                openFile();
            }
        }
    }
    
    /**
     * 
     */
    class SaveActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getActionCommand().equals("Save")) {
                saveFile();
            }
        }
    }
    
    /**
     * 
     */
    class QuitActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getActionCommand().equals("Quit")) {
                quit();
            }
        }
    }
    
    /**
     * 
     */
    class AboutActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getActionCommand().equals("About ImageViewer")) {
                about();
            }
        }
    }   
            
}