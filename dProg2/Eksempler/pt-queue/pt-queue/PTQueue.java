
/**
 * Write a description of interface PTQueue here.
 * 
 * @author Michael E. Caspersen 
 * @version 2 November 2007
 */

public interface PTQueue<T> {
    int size();
    boolean isEmpty();
	PTQueue<T> add(T e);
	T min();
	PTQueue<T> removeMin();
}
