import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.util.*;

/**
 * A JPanel view for a grid. The icons of the pieces in the
 * grid are drawn on the panel.
 */
public class GridView extends JPanel
    implements Observer<GridEvent<Piece>> {

    private Grid<JLabel> grid;

    private Random rand;
    private long seed;
    private Boolean update = true;

    /**
     * Creates a view for a grid.
     * @param g the grid
     */
    public GridView(Grid<Piece> g) {
        int width = g.getWidth();
        int height = g.getHeight();
        setLayout(new GridLayout(width, height, 0, 0));
        setBackground(Color.WHITE);
        
        grid = new Grid<JLabel>(width, height);
        Dimension size = new Dimension(Piece.SIZE, Piece.SIZE);

        for(int x = 0; x < width; x++)
            for(int y = 0; y < height; y++) {
                JLabel label = new JLabel(getIcon(g.get(x,y)));
                label.setPreferredSize(size);

                int bottom = y == height - 1 ? 1 : 0;
                int right = x == width - 1 ? 1 : 0;

                label.setBorder(BorderFactory.createMatteBorder(1, 1, right,
                                                                bottom,
                                                                Color.GRAY));
                
                grid.set(x,y, label);
                add(label);

                rand = new Random();
                seed = rand.nextLong();
                rand.setSeed(seed);
            }

        g.addObserver(this);
    }

    private Icon getIcon(Piece p) {
        return p == null ? null : p.getIcon();
    }

    /**
     * The update method required for observers.
     * @param e the event that triggered the update
     */
    public void update(GridEvent<Piece> e) {
        if(update)
            grid.get(e.getX(), e.getY()).setIcon(getIcon(e.getElement()));
    }

    /**
     * Sets the update property.
     * If it is false, updates will not be drawn when the
     * grid is changed.
     * param update the new value of the update property
     */
    public void setUpdate(boolean update) {
        this.update = update;
    }

    /**
     * Redraws the grid as specified in the parameter.
     * @param g the grid to draw
     */
    public void redraw(Grid<Piece> g) {
        for(int x = 0; x < g.getWidth(); x++)
            for(int y = 0; y < g.getHeight(); y++)
                grid.get(x,y).setIcon(getIcon(g.get(x,y)));
    }

    /**
     * Paints the grid using the given Graphics object.
     * @param g the Graphics object
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

}
