/**
 * Generic observer pattern.
 *
 * Classes implementing this interface can listen for events from
 * {@linkplain Observable observable} objects.
 *
 * @param <T> the type of events the implementing class is interested
 * in.
 *
 * @see Observable
 */
public interface Observer<T> {

    /**
     * Handle an event.
     *
     * This method is called whenever {@link
     * Observable#notifyObservers} is called on the {@link Observable}
     * to which this class is connected.
     *
     * @param e an event.
     */
    public void update(T e);
}
