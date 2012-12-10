import java.util.*;
class ListStack <T> extends AbstractCollection<T> implements Stack<T> { 
    private List<T> s; 
    public ListStack(){
        s= new ArrayList<T>(); 
    } 
    public int size(){
        return s.size();
    } 
    public boolean isEmpty(){ 
        return s.isEmpty(); 
    } 
    public void push(T ... elms){
        for(T e : elms) {
            s.add(e);
        }
    }
    
    public void push(T e){  
        s.add(e);
    } 
    public T top(){ 
        return s.get(s.size() - 1);
    } 
    public void pop(){
        s.remove(s.size() - 1);
    }
    
    public Iterator<T> iterator(){
        return new Iterator<T>(){
            int i = s.size() - 1;
            public boolean hasNext() {
                return i > -1;
            }
            public T next(){
                i = i - 1;
                return s.get(i + 1);
            }
            public void remove(){}
        };
    }
} 
