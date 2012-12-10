import java.awt.*;
import javax.swing.*;

/**
 * Represents a fox.
 * 
 * @author David Matuszek
 * @author Mikkel Kroeigaard
 * @version August 16, 2005
 */
public class Fox extends Animal {

    /**
     * Constructs a Fox in the given model, at the given position
     * in the field.
     *
     * @param model the model that controls this fox.
     */
    public Fox(Model model) {
        super(model);
 
        Image i = (new ImageIcon("fox.png")).getImage();
        Image ni = i.getScaledInstance(Piece.SIZE,Piece.SIZE,
                                       Image.SCALE_DEFAULT);
        setIcon(new ImageIcon(ni));
    }
}
