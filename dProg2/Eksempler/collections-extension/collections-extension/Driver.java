import java.util.*;

public class Driver
{
    private Collection<Person> personDB;
    
    /**
     * Creates a personDB with eight person objects
     */
    public Driver() {
        Collection<Person> c = new ArrayList<Person>();
        Person p;
        p = new Person("Paul", "McCartney", 65); c.add(p);
        p = new Person("Bruce", "Springsteen", 58); c.add(p);
        p = new Person("Michael", "Caspersen", 46); c.add(p);
        p = new Person("Christopher", "Caspersen", 18); c.add(p);
        p = new Person("Ghita", "N¿rby", 72); c.add(p);
        p = new Person("Peter", "Bastian", 64); c.add(p);
        p = new Person("Edsger", "Dijkstra", 77); c.add(p);
        p = new Person("Anne-Sophie", "Mutter", 44); c.add(p);
        personDB = c;
    }

    /**
     * @return an ArrayList with the objects from personDB
     */
    private ArrayList<Person> createPersonArrayList() {
        ArrayList<Person> c = new ArrayList<Person>();
        c.addAll(personDB);
        return c;
    }

    /**
     * print objects of collection c
     * @param c the Collection to print
     */
    private void printCollection(Collection<Person> c) {
       for ( Person p : c ) {
            SOP("  " + p);
        }
    }
    
    private void SOP(Object o) {
        System.out.println(o);
    }

    /**
     * Test MyCollections.findOne(List<T>, Property p), MyCollections.findAll(List<T>, Property p)
     * with respect to interface Property
     */
    public void run1() {
        List<Person> personerAL = createPersonArrayList();
        
        SOP(MyCollections.findOne(personerAL, new SeniorProperty()));
        SOP(MyCollections.findAll(personerAL, new SeniorProperty()));
        SOP(MyCollections.findAll(personerAL, new ComposedProperty()));
        SOP(MyCollections.findAll(personerAL, new Property<Person>() {
            public boolean satisfiedBy(Person p) {
                return p.age() >= 50 && p.age() <= 75;
            }
        }));
    }
}
