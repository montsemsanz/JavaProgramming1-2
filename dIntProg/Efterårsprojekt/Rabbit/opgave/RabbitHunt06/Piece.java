import javax.swing.Icon;

/**
 * Describes a piece on a board. A piece has a specific
 * size and an Icon.
 */
public abstract class Piece {

    public static int SIZE = 20;

    Icon icon = null;

    /**
     * Creates a new piece with no icon.
     */
    public Piece() {}

    /**
     * Creates a new piece with the specified icon.
     * @param icon the icon
     */
    public Piece(Icon icon) {
        this.icon = icon;
    }

    /**
     * Returns the icon for this piece.
     * @return the icon for this piece
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     * Sets the icon for this piece.
     * @param icon the new icon
     */
    public void setIcon(Icon icon) {
        this.icon = icon;
    }

}
