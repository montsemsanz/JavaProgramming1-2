public class ComposedProperty implements Property<Person> {

    public boolean satisfiedBy(Person p) {
        return p.age() >= 10 && p.lastname().startsWith("C");
    }
}
