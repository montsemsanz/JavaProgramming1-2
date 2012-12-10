import java.util.List;
import java.util.ArrayList;

/** Grid models a grid of objects.
 *
 * It works the same way as a two-dimensional array, but it also works
 * with generics. Furthermore, it generates events when changes are
 * made.
 */
public class Grid<T> extends Observable<GridEvent<T>> {

    private List<T> grid;
    private int width, height;

    /** Creates a new Grid.
     *
     * @param width the width of the Grid, must be non-negative.
     * @param height the height of the Grid, must be non-negative.
     * @throws IllegalArgumentException if the width or height is
     * negative.
     */
    public Grid(int width, int height) {
        if(width < 0 || height < 0)
            throw new IllegalArgumentException("Negative width or height");

        this.width = width;
        this.height = height;

        // Java does not like generic arrays so we use one big list
        // instead.
        grid = new ArrayList<T>(width * height);

        // Fill the grid with nulls to create the empty grid.
        for (int i = 0; i < width * height; i++)
            grid.add(null);
    }
    
    /** Get the height of the Grid.
     *
     * @return the height of the Grid.
     */
    public int getHeight() {
        return height;
    }

    /** Get the width of the Grid.
     *
     * @return the width of the Grid.
     */
    public int getWidth() {
        return width;
    }

    /** Sets the position (x,y) in the Grid.
     *
     * @param x the x position.
     * @param y the y position.
     * @param t the new value for position (x,y).
     */
    public void set(int x, int y, T t) {
        if(x < 0 || y < 0 || x >= width || y >= height)
            throw new IndexOutOfBoundsException("Grid index out of bounds");
        grid.set(y*width + x, t);
        notifyObservers(new GridEvent<T>(x, y, t));
    }

    /** Gets the position (x,y) in the Grid.
     *
     * @param x the x position.
     * @param y the y position.
     * @return the value at position (x,y).
     */
    public T get(int x, int y) {
        if(x < 0 || y < 0 || x >= width || y >= height)
            throw new IndexOutOfBoundsException("Grid index out of bounds");
        return grid.get(y*width + x);
    }


}
