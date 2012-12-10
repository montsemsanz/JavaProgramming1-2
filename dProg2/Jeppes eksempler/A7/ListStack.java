import java.util.*;
public class ListStack<T> implements Stack<T>{

    private List<T> elms = new ArrayList<T>();
    public void push(T v){ elms.add(v);}
    public T top(){ return elms.get(elms.size() - 1);} 
    public T pop(){ return elms.remove(elms.size() - 1);}
    public boolean isEmpty() { return elms.isEmpty();}
    @Override
    public String toString(){return elms.toString();}
    public int sizes(){return elms.size();}
}
