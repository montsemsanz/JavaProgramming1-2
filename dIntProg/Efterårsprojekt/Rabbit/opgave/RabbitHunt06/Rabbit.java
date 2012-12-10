import java.awt.*;
import javax.swing.*;

/**
 * Models the rabbit.
 */
public class Rabbit extends Animal {

    /**
     * Creates a new rabbit with a default
     * brain that does nothing.
     * @param model the model to use
     */
    public Rabbit(Model model) {
        super(model);
        setIcon(new ImageIcon("rabbit.png"));
    }

}
