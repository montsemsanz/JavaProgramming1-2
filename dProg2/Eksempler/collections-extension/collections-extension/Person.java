/**
 * Denne klasse simulerer en person
 * 
 * @author Michael E. Caspersen
 * @version september 2005
 */
public class Person implements Comparable<Person>
{

    private String firstName;
    private String lastName;
    private int age;
    
    /**
     * Construktor til klassen Person
     * @param n personens navn
     * @param a personens alder
     */
    public Person(String firstName, String lastName, int a) {
        this.firstName = firstName;
        this.lastName = lastName;
        age = a;
    }
    
    public String firstname() {
        return firstName;
    }
    
    public String lastname() {
        return lastName;
    }
    
    public int age() {
        return age;
    }
    
    public boolean isTeenager() {
        return age() >= 13 && age() <= 19;
    }
    
    public boolean isSenior() {
        return age() >= 65;
    }
    
    public String toString() {
        return firstName + " " + lastName + " (" + age + ")";
    }

///*    
    public int compareTo(Person p) {
        return firstName.compareTo(p.firstName);
    }
//*/

/*
    public int compareTo(Person p) {
        return lastName.compareTo(p.lastName);
    }
*/

/*
    public int compareTo(Person p) {
        return ...;
    }
*/
}
