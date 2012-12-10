
/**
 * Write a description of interface Stack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Stack<T>
{
    int size();
    boolean isEmpty();
    void push(T e);
    T top();
    void pop();
}
