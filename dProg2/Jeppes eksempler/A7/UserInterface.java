import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * A graphical user interface for the calculator. No calculation is being
 * done here. This class is responsible just for putting up the display on 
 * screen. It then refers to the "CalcEngine" to do all the real work.
 * 
 * @author David J. Barnes and Michael Kolling
 * @version 2006.03.30
 */
public class UserInterface
    implements ActionListener
{
    private CalcEngine calc;
    private boolean showingAuthor;

    private JFrame frame;
    private JTextField display;
    private JLabel status;

    /**
     * Create a user interface.
     * @param engine The calculator engine.
     */
    public UserInterface()
    {
        showingAuthor = true;
        makeFrame();
        frame.setVisible(true);
    }

    /**
     * Set the visibility of the interface.
     * @param visible true if the interface is to be made visible, false otherwise.
     */
    public void setVisible(boolean visible)
    {
        frame.setVisible(visible);
    }

    /**
     * Make the frame for the user interface.
     */
    private void makeFrame()
    {
        frame = new JFrame();
        
        JPanel contentPane = (JPanel)frame.getContentPane();
        contentPane.setLayout(new BorderLayout(8, 8));
        contentPane.setBorder(new EmptyBorder( 10, 10, 10, 10));

        display = new JTextField();
        display.setEditable(false);
        contentPane.add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 5));
            addButton(buttonPanel, "7");
            addButton(buttonPanel, "8");
            addButton(buttonPanel, "9");
            addButton(buttonPanel, "C");
            addButton(buttonPanel, "*");
            
            addButton(buttonPanel, "4");
            addButton(buttonPanel, "5");
            addButton(buttonPanel, "6");
            addButton(buttonPanel, "?");
            addButton(buttonPanel, "/");
            
            addButton(buttonPanel, "1");
            addButton(buttonPanel, "2");
            addButton(buttonPanel, "3");
            addButton(buttonPanel, "!");
            addButton(buttonPanel, "sqrt");

            
            addButton(buttonPanel, "0");
            addButton(buttonPanel, "+");
            addButton(buttonPanel, "-");
            addButton(buttonPanel, "E");
            
        contentPane.add(buttonPanel, BorderLayout.CENTER);
        PanelStack pStack = new PanelStack<Integer>();
        calc = new CalcEngine(pStack);

        contentPane.add(pStack, BorderLayout.EAST);
        
        status = new JLabel(calc.getAuthor());
        contentPane.add(status, BorderLayout.SOUTH);

        frame.pack();
    }

    /**
     * Add a button to the button panel.
     * @param panel The panel to receive the button.
     * @param buttonText The text for the button.
     */
    private void addButton(Container panel, String buttonText)
    {
        JButton button = new JButton(buttonText);
        button.addActionListener(this);
        panel.add(button);
    }

    /**
     * An interface action has been performed.
     * Find out what it was and handle it.
     * @param event The event that has occured.
     */
    public void actionPerformed(ActionEvent event)
    {
        String command = event.getActionCommand();

        if(command.equals("0") ||
           command.equals("1") ||
           command.equals("2") ||
           command.equals("3") ||
           command.equals("4") ||
           command.equals("5") ||
           command.equals("6") ||
           command.equals("7") ||
           command.equals("8") ||
           command.equals("9")) {
            int number = Integer.parseInt(command);
            calc.numberPressed(number);
        }
        else if(command.equals("+")) {
            calc.plus();
        }
        else if(command.equals("-")) {
            calc.minus();
        }
        else if(command.equals("E")) {
            calc.E();
        }
        else if(command.equals("C")) {
            calc.clear();
        }
        else if(command.equals("!")) {
            calc.fak();
        }
        else if(command.equals("*")) {
            calc.mult();
        }
        else if(command.equals("/")) {
            calc.div();
        }
        else if(command.equals("sqrt")) {
            calc.sqrt();
        }
        else if(command.equals("?")) {
            showInfo();
        }
        // else unknown command.

        redisplay();
    }

    /**
     * Update the interface display to show the current value of the 
     * calculator.
     */
    private void redisplay()
    {
        display.setText("" + calc.getDisplayValue());
        status.setText(calc.getStatus());
    }

    /**
     * Toggle the info display in the calculator's status area between the
     * author and version information.
     */
    private void showInfo()
    {
        if(showingAuthor)
            status.setText(calc.getVersion());
        else
            status.setText(calc.getAuthor());

        showingAuthor = !showingAuthor;
    }
}
