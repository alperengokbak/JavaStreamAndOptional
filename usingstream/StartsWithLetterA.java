import models.Person;

import java.util.List;
import java.util.stream.Collectors;

public class StartsWithLetterA {
    public static List<String> Example(List<Person> people) {
        return people.stream()
                .map(Person::getName)
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
    }
    public static void Example2(List<Person> people){
        people.stream().filter(person -> person.getName().startsWith("A")).forEach(System.out::println);
    }
}
