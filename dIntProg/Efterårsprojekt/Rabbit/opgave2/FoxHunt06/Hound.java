import java.awt.*;
import javax.swing.*;

/**
 * Models the hound.
 */
public class Hound extends Animal {

    /**
     * Creates a new hound with a default
     * brain that does nothing.
     * @param model the model to use
     */
    public Hound(Model model) {
        super(model);
        setIcon(new ImageIcon("hound.png"));
    }

}
