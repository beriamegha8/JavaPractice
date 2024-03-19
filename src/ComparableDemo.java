import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Person class implementing Comparable interface
class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Implementing compareTo method for natural ordering based on age
    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        // Creating a list of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Displaying the list before sorting
        System.out.println("List before sorting:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Sorting the list using Collections.sort() which relies on Comparable
        Collections.sort(people);

        // Displaying the list after sorting
        System.out.println("\nList after sorting by age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}