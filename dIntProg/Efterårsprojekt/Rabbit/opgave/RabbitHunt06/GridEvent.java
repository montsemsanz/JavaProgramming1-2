/**
 * This class describes events generated by changing
 * a grid.
 */
public class GridEvent<T> {

    private int x, y;
    private T t;

    /**
     * Creates a new grid event.
     * The coordinate pair for the change is given, and
     * the new value for the position is also given.
     * @param x the first coordinate
     * @param y the second coordinate
     * @param t the new value
     */
    public GridEvent(int x, int y, T t) {
        this.x = x; this.y = y;
        this.t = t;
    }

    /**
     * Returns the first coordinate of the position
     * that was changed.
     * @return the first coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Returns the second coordinate of the position
     * that was changed.
     * @return the second coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Returns the new value.
     * @return the new value
     */
    public T getElement() {
        return t;
    }

    /**
     * Returns a String representation of the change.
     * @return a String representation of the change
     */
    public String toString() {
        return "GridEvent(" + x + ", " + y + ")";
    }

}
