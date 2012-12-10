import java.util.*;
public interface Stack<T> extends Collection<T>{ 
    /** 
     * Returns the number of elements in the Stack 
     */ 
    int size(); 
 
    /** 
     * Returns whether the Stack is empty 
     */ 
    boolean isEmpty(); 
 
    /** 
     * Push element e on top of the Stack 
     */ 
    void push(T ... e); 
 
    /** 
     * Returns the top element of the Stack 
     * pre: !isEmpty() 
     */ 
    T top(); 
 
    /** 
     * Removes the top element of the Stack 
     * pre: !isEmpty() 
     */ 
    void pop();
} 
