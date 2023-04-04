import models.Person;

import java.util.*;

public class MaxAndComparator {
    public static Person oldFormatgetOldestPerson(List<Person> people) {
        Person oldestPerson = new Person("", 0);
        for (Person person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

    /*
    Firstly, we take a person from the person list,
    after, we need to return the biggest value of the
    person's age.
     */
    public static Person getOldestPerson(List<Person> people) {
        return people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElse(null);
    }

}
