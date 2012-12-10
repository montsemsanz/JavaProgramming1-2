import java.util.*;
/**
 * List-based implementation of PTQueue.
 * 
 * @author Michael E. Caspersen
 * @version 2 November 2007
 */
public class PTQueueList<T extends Comparable<T>> implements PTQueue<T> {

    private List<T> q;
    
    public PTQueueList()          { q= new ArrayList<T>();        }   
    public int size()             { return q.size();              }
    public boolean isEmpty()      { return q.isEmpty();           }
    public PTQueue<T> add(T e)    { q.add(e); return this;        }
    public T min()                { return Collections.min(q);    }
    public PTQueue<T> removeMin() { q.remove(min()); return this; }
}
