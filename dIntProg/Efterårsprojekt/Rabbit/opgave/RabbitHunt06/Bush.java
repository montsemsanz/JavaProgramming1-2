import java.awt.*;
import javax.swing.*;

/**
 * Represents a bush. Bushes don't do anything, they're just there.
 * 
 * @author David Matuszek
 * @version October 12, 2001
 */
public class Bush extends Piece {

    /**
     * Creates a new bush.
     */
    public Bush() {
        super(null);
        setIcon(new ImageIcon("bush.png"));
    }
}
