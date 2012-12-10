import java.util.*;
/**
 * List-based implementation of Stack.
 * 
 * @suthor Susie 
 * @version 4. November 2007
 */
public class ListStack <T extends Comparable<T>> implements Stack<T>
{
    private List<T> s;
    
    public ListStack()          { s= new ArrayList<T>();            }
    public int size()           { return s.size();                  }
    public boolean isEmpty()    { return s.isEmpty();               }
    public void push(T e)       { s.add(e);                         }
    public T top()              { return s.get(size()-1);           }
    public void pop()           { s.remove(top());                  }
        
}
