public class SeniorProperty implements Property<Person> {

    public boolean satisfiedBy(Person p) {
        return p.age() >= 65;
    }
}
