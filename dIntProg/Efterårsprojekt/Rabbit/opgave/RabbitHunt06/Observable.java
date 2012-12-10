import java.util.*;

/**
 * This class represents an observable object in the model-view
 * paradigm.  It should be subclassed to represent an object that the
 * application wants to have observed.
 *
 * <p>
 *
 * An observable object can have any number of observers associated
 * with it.  An observer may be any object that implements interface
 * {@link Observer}.  After an observable instance changes, an
 * application calling the {@code Observable}'s {@link
 * #notifyObservers} method causes all of its observers to be notified
 * of the change by a call to their {@link Observer#update} method.
 *
 * <p>
 *
 * The order of notifications is not specified, but they will be
 * delivered in the thread which called {@link #notifyObservers}.
 */
public abstract class Observable<T> {

    /**
     * The observers which will receive notifications.
     */
    private List<Observer<T>> observers = new LinkedList<Observer<T>>();

    /**
     * Adds an observer to the set of observers for this object.
     *
     * The newly added observer will be 
     * observers is not specified.
     */
    public void addObserver(Observer<T> o) {
        observers.add(o);
    }

    /**
     * Remove an observer.
     *
     * @param o the observer to be removed.
     */
    public void removeObserver(Observer<T> o) {
        observers.remove(o);
    }

    /**
     * Send out an notification to all observers.
     *
     * Each registered observers {@link Observer#update} method will
     * be called with the {@code e} argument.  The exact order of the
     * notifications is not specified.
     *
     * @param e the event to pass to all observers.
     *
     * @see Observer#update
     */
    protected void notifyObservers(T e) {
        for(Observer<T> o : observers)
            o.update(e);
    }

}
