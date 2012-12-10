import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ImageViewer is the main class of the image viewer application. It builds and
 * displays the application GUI and initialises all other components.
 * 
 * To start the application, create an object of this class.
 * 
 * @author Michael Kolling and David J Barnes 
 * @version 0.4
 */
public class ImageViewer
{
    private JFrame frame;
    private ImagePanel imagePanel;
    private JLabel filenameLabel;
    private JLabel statusLabel;
    private OFImage currentImage;
        
    /**
     * Create an ImageViewer show it on screen.
     */
    public ImageViewer()
    {
        currentImage = null;
        makeFrame();
    }

    // ---- implementation of menu functions ----
    
    /**
     * Open function: open a file chooser to select a new image file.
     */
    private void openFile()
    {
        OFImage image = ImageFileManager.getImage();
        imagePanel.setImage(currentImage);
        showStatus("File loaded. ");
        frame.pack();
    }
    
    /**
     * Quit function: quit the application.
     */
    private void quit()
    {
        System.exit(0);
    }
    
    /**
     * 
     */
    private void showAbout()
    {
        JOptionPane.showMessageDialog(frame, 
                    "ImageViewer\n", 
                    "About ImageViewer", 
                    JOptionPane.INFORMATION_MESSAGE);
    }
   
    
    /**
     * "Darker" function: make the picture darker.
     */
    private void makeDarker()
    {
        if(currentImage != null) {
            currentImage.darker();
            frame.repaint();
            showStatus("Applied: darker");
        }
        else {
            showStatus("No Image loaded. ");
        }
    }
        
    /**
     * 
     */
    private void makeLighter()
    {
        if(currentImage != null) {
            currentImage.lighter();
            frame.repaint();
            showStatus("Applied: lighter");
        }
        else {
            showStatus("No Image loaded. ");
        }
    }
    
    /**
     * 
     */
    private void threshold()
    {
        if(currentImage != null) {
            currentImage.threshold();
            frame.repaint();
            showStatus("Applied: threshold");
        }
        else {
            showStatus("No Image loaded. ");
        }
    }
       
    /**
     * 
     */
    public void showStatus(String text)
    {
        statusLabel.setText(text); 
    }
    
    // ---- swing stuff to build the frame and all its components ----
    
    /**
     * Create the Swing frame and its content.
     */
    private void makeFrame()
    {
        frame = new JFrame("ImageViewer");
        makeMenuBar(frame);
        
        Container contentPane = frame.getContentPane();
        
        contentPane.setLayout(new BorderLayout());
        
        filenameLabel = new JLabel();
        contentPane.add(filenameLabel, BorderLayout.NORTH);
        
        imagePanel = new ImagePanel();
        contentPane.add(imagePanel, BorderLayout.CENTER);
        
        statusLabel = new JLabel("Version 1.0");
        contentPane.add(statusLabel, BorderLayout.SOUTH);
        
        // building is done - arrange the components and show        
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * Create the main frame's menu bar.
     * @param frame   The frame that the menu bar should be added to.
     */
    private void makeMenuBar(JFrame frame)
    {
        final int SHORTCUT_MASK =
            Toolkit.getDefaultToolkit().getMenuShortcutKeyMask();


        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        // create the File menu
        JMenu fileMenu = new JMenu("File");
        menubar.add(fileMenu);
        
        JMenuItem openItem = new JMenuItem("Open");
            openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, SHORTCUT_MASK));
            openItem.addActionListener(new ActionListener() {
                               public void actionPerformed(ActionEvent e) { openFile(); }
                           });
        fileMenu.add(openItem);

        JMenuItem quitItem = new JMenuItem("Quit");
            quitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, SHORTCUT_MASK));
            quitItem.addActionListener(new ActionListener() {
                               public void actionPerformed(ActionEvent e) { quit(); }
                           });
        fileMenu.add(quitItem);
        
        // create the Help menu
        
        JMenu helpMenu = new JMenu("Help");
        menubar.add(helpMenu);
        
        JMenuItem aboutItem = new JMenuItem("About ImageViewer");
            aboutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, SHORTCUT_MASK));
            aboutItem.addActionListener(new ActionListener() {
                               public void actionPerformed(ActionEvent e) { showAbout(); }
                           });
        fileMenu.add(aboutItem);
        
        
        // create the Filter Menu
        JMenu filterMenu = new JMenu("Filter");
        menubar.add(filterMenu);
        
        JMenuItem darkerItem = new JMenuItem("Darker");
            darkerItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, SHORTCUT_MASK));
            darkerItem.addActionListener(new ActionListener() {
                               public void actionPerformed(ActionEvent e) { makeDarker(); }
                           });    
        filterMenu.add(darkerItem);
        
        JMenuItem lighterItem = new JMenuItem("Lighter");
            lighterItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, SHORTCUT_MASK));
            lighterItem.addActionListener(new ActionListener() {
                               public void actionPerformed(ActionEvent e) { makeLighter(); }
                           });
        filterMenu.add(lighterItem);
        
        JMenuItem thresholdItem = new JMenuItem("Threshold");
            thresholdItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, SHORTCUT_MASK));
            thresholdItem.addActionListener(new ActionListener() {
                               public void actionPerformed(ActionEvent e) { threshold(); }
                           });
        filterMenu.add(thresholdItem);
    }
}
