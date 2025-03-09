import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.age;


    }
}

public class TestApp {

    public static void main(String[] args) {
        testSort();
    }

    public static void testSort()
    {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("John", 30));
        people.add(new Person("Alice", 24));
        people.add(new Person("Bob", 27));

        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.age, p2.age);
            }
        });

        System.out.println(people);
    }
}
