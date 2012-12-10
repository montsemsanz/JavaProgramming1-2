import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Semaphore;

/**
 * Set up the GUI and handles events, and lets the fox and
 * hounds take turns moving.
 * 
 * @author David Matuszek
 * @author Martin Geisler
 * @author Mikkel Kroeigaard
 * @author Casper Torndahl
 * @version Januar 29, 2006
 */
public class Controller extends JFrame implements Runnable {

    // instance variables -- references to main classes
    private Model model;
    private Controller controller;
    
    // instance variables -- used for program control
    private boolean animationIsRunning = false;
    private int animationDelay;
    private int lookDelay; 
    private boolean showEveryLook = true;
    
    // instance "varibles" -- constants for use anywhere
    private int canvasWidth = 400;
    private int canvasHeight = 400;
    
    // instance variables -- display elements
    private GridView   gridView;
    private JButton    stepButton   = new JButton("Step");
    private JButton    runButton    = new JButton("Run");
    private JButton    stopButton   = new JButton("Stop");
    private JButton    resetButton  = new JButton("Reset");
    private JButton    replayButton = new JButton("Replay");
    private JScrollBar speedBar     = new JScrollBar(JScrollBar.HORIZONTAL);
    private JScrollBar timeBar      = new JScrollBar(JScrollBar.HORIZONTAL);
    private JLabel     messageLabel = new JLabel("Let the hunt begin!");
    private int        totalSteps   = 0;
    private boolean    replayMode   = false;
    private boolean    dontUpdate   = false;
    private int        updaters     = 0;
    private Semaphore  mutex        = new Semaphore(1);
    
    /**
     * Constructs a Controller that uses the given model and view.
     */
    Controller(Model model) {
        this.model = model;
        this.controller = this;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Fox-Hunt 2006");
        setLocation(50, 50);
        createGui();
    }
    
    /**
     * Starts and controls the animation.
     */
    public void run() {
        while (animationIsRunning && !model.gameIsOver()) {
            try { Thread.sleep(animationDelay); }
            catch (InterruptedException e) { }
            step();
        }
    }
    
    /**
     * Tells the model to make one animation "step," then tells
     * the view to display the result.
     */
    private void step() {
        model.allowSingleMove();
        updateVisuals();
    }

    // Updates labels, buttons and scrollbars
    private void updateVisuals() {
        try {
            mutex.acquire();
        } catch(InterruptedException e) {}
        updaters++;
        mutex.release();
        
        if (dontUpdate)
            return;

        if (model.gameIsOver()) {
            messageLabel.setText("The Hound eats the fox after " +
                                 model.stepsTaken() + " turns!");
            totalSteps = model.stepsTaken();
            animationIsRunning = false;
            runButton.setEnabled(false);
            stopButton.setEnabled(false);
            stepButton.setEnabled(false);
            resetButton.setEnabled(true);
            replayButton.setEnabled(true);
            timeBar.setValues(0,1,0,totalSteps+1);
            timeBar.setValue(totalSteps);
            timeBar.setEnabled(true);
            replayMode = true;
        } else {
            runButton.setEnabled(!animationIsRunning);
            stepButton.setEnabled(true);
            timeBar.setEnabled(replayMode && !animationIsRunning);
            stopButton.setEnabled(animationIsRunning);
            resetButton.setEnabled(true);
            replayButton.setEnabled(model.stepsTaken() > 0);
            if (replayMode) {
                timeBar.setValue(model.stepsTaken());
                messageLabel.setText("Step " + model.stepsTaken()
                                     + " of " + totalSteps);
            }
            else
                messageLabel.setText("Step number " + model.stepsTaken());
        }
        
        try {
            mutex.acquire();
        } catch(InterruptedException e) {}
        updaters--;
        mutex.release();
    }

    /**
     * Sets up the graphical user interface, including adding actions
     * to the components, and displays it.
     */
    private void createGui() {
        gridView = new GridView(model.getField());
        Box controlBox = new Box(BoxLayout.X_AXIS);
        controlBox.add(new JLabel("Speed:"));
        controlBox.add(Box.createHorizontalStrut(5));
        controlBox.add(speedBar);
        controlBox.add(Box.createHorizontalStrut(5));
        controlBox.add(stepButton);
        controlBox.add(Box.createHorizontalStrut(5));
        controlBox.add(runButton);
        controlBox.add(Box.createHorizontalStrut(5));
        controlBox.add(stopButton);
        controlBox.add(Box.createHorizontalStrut(5));
        controlBox.add(resetButton);
        controlBox.add(Box.createHorizontalStrut(5));
        controlBox.add(replayButton);
    
        Dimension size = controlBox.getPreferredSize();
        size.width = Integer.MAX_VALUE;
        controlBox.setMaximumSize(size);

        Box mainLayout = new Box(BoxLayout.Y_AXIS);
        mainLayout.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        messageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        mainLayout.add(messageLabel);
        mainLayout.add(Box.createVerticalStrut(5));
        mainLayout.add(gridView);
        mainLayout.add(Box.createVerticalStrut(5));
        mainLayout.add(controlBox);
        mainLayout.add(Box.createVerticalStrut(5));
        mainLayout.add(timeBar);
        
        // add actions to the controls (see end of this file)
        stepButton.addActionListener(new StepButtonHandler());
        runButton.addActionListener(new RunButtonHandler());
        stopButton.addActionListener(new StopButtonHandler());
        stopButton.setEnabled(false);
        animationIsRunning = false;
        resetButton.addActionListener(new ResetButtonHandler());
        replayButton.addActionListener(new ReplayButtonHandler());
        replayButton.setEnabled(false);
        speedBar.addAdjustmentListener(new SpeedBarListener());
        timeBar.addAdjustmentListener(new TimeBarListener());
        
        // finish up and display the GUI
        add(mainLayout);
        pack();
        
        speedBar.setValue(50);
        timeBar.setValue(0);
        timeBar.setEnabled(false);

        setVisible(true);
        
        setDelays(50);
    }
    
    /**
     * Computes the animation delay and the delay between "looks," based
     * on the current value of the speedBar.
     *
     * @param value  current value returned from the speedBar (0..90)
     */
    private void setDelays(int value) {
        animationDelay = (int)(2320 - 500 * Math.log(value + 10));
        lookDelay = animationDelay / 2 + 10;
    }
    
    /**
     * Inner class for handling the Step button.
     */
    class StepButtonHandler implements ActionListener {
    
        /**
         * Handles the Step button. If the animation is running, 
         * the Step button just halts it (by setting the
         * <code>programIsRunning</code> flag to false); otherwise, the
         * foxhunt is advanced one step. While single stepping,
         * all buttons except the Stop button should be enabled.
         *
         * @param e the Event that invoked this handler (ignored).
         */
        
        private StepThread st;

        public StepButtonHandler() {
            st = new StepThread();
            st.start();
        }

        public void actionPerformed(ActionEvent e) {
        
            if (animationIsRunning) {
                animationIsRunning = false;
                
                // adjust button states when animation is stopped
                if (!model.gameIsOver()) {
                    runButton.setEnabled(true);
                    stopButton.setEnabled(false);
                    resetButton.setEnabled(true);
                }
                replayButton.setEnabled(true);
            }
            else {
                runButton.setEnabled(false);
                replayButton.setEnabled(false);
                resetButton.setEnabled(false);
                timeBar.setEnabled(false);

                synchronized(st) {
                    st.notify();
                }
            }
        }

        private class StepThread extends Thread {
            public void run() {
                while(true) {
                    synchronized(this) {
                        try {
                            wait();
                        } catch(InterruptedException e) {}
                    }
                    // look lines are boring
                    //model.setLookLines(true);
                    step();
                    //model.setLookLines(false);
                    updateVisuals();
                }
            }
        }
    }

    /**
     * Inner class for handling the Run button.
     */
    class RunButtonHandler implements ActionListener {
    
        /**
         * Sets the <code>programIsRunning</code> flag to true, and
         * creates and starts an animation Thread to do the animation.
         * While the animation is running, all buttons except the Run
         * button should be enabled.
         *
         * @param e the Event that invoked this handler (ignored).
         */
        public void actionPerformed(ActionEvent e) {
            runButton.setEnabled(false);
            stopButton.setEnabled(true);
            resetButton.setEnabled(false);
            replayButton.setEnabled(false);
            timeBar.setEnabled(false);

            Thread animationThread = new Thread(controller);
            animationIsRunning = true;
            animationThread.start();
        }
    }

    /**
     * Inner class for handling the Stop button.
     */
    class StopButtonHandler implements ActionListener {
    
        /**
         * Sets the <code>programIsRunning</code> flag to false, thus
         * causing run() to end the Thread doing the animation.
         * While the animation is stopped, all buttons except
         * the Stop button should be enabled.
         *
         * @param e the Event that invoked this handler (ignored).
         */
        public void actionPerformed(ActionEvent e) {
            animationIsRunning = false;
            updateVisuals();
        }
    }
    
    /**
     * Inner class for handling the Reset button.
     */
    class ResetButtonHandler implements ActionListener {
    
        /**
         * Recreates the entire setup, including placement of
         * bushes and animals. Cannot be performed while the
         * animation is running. Afterwards, all buttons except
         * the Stop button should be enabled.
         *
         * @param e the Event that invoked this handler (ignored).
         */
        public void actionPerformed(ActionEvent e) {
            animationIsRunning = false;
            replayMode = false;
            timeBar.setValue(0);
            timeBar.setEnabled(false);
            model.reset();
            updateVisuals();
        }
    }

    /**
     * Inner class for handling the Replay button.
     */
    class ReplayButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            animationIsRunning = false;
            model.replay();
            updateVisuals();
        }
    }
    
    /**
     * Inner class for handling the SpeedBar control.
     */
    class SpeedBarListener implements AdjustmentListener {
    
        /**
         * Handles the SpeedBar control. Speed control is nonlinear,
         * and the formula used is a hack job that should be replaced.
         *
         * @param e the Event that invoked this handler (ignored).
         */
        public void adjustmentValueChanged(AdjustmentEvent e) {
            int scrollBarValue = e.getValue();
            setDelays(scrollBarValue);
        }
    }

    private class TimeBarListener implements AdjustmentListener {
        
        private boolean running = false;
        
        public void adjustmentValueChanged(AdjustmentEvent e) {
            try {
                mutex.acquire();
            } catch(InterruptedException ie) {}
            if(!replayMode || updaters > 0) {
                mutex.release();
                return;
            }
            mutex.release();
            
            messageLabel.setText("Step " + timeBar.getValue()
                                 + " of " + totalSteps);
            
            if(!e.getValueIsAdjusting()) {
                gridView.setUpdate(false);
                dontUpdate = true;
                if(timeBar.getValue() < model.stepsTaken())
                    model.replay();
                               
                while(model.stepsTaken() != timeBar.getValue())
                    model.allowSingleMove();


                gridView.redraw(model.getField());
                gridView.setUpdate(true);
                dontUpdate = false;
                updateVisuals();
            }
        }
    }
}
