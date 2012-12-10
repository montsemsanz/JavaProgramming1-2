import java.util.*;

public class MyCollections<T> {

    public static <T>
    T findOne(List<T> l, Property<T> p) {
        T res= null;
        for ( T e: l ) {
            if ( p.satisfiedBy(e) ) return e;
        }
        return res;
    }
    
    public static <T>
    List<T> findAll(List<T> l, Property<T> p) {
        List<T> res= new ArrayList<T>();
        for ( T e: l ) {
            if ( p.satisfiedBy(e) ) res.add(e);
        }
        return res;
    }
}
