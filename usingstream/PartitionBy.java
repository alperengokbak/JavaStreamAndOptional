import models.Person;

import java.util.*;
import java.util.stream.Collectors;

public class PartitionBy {
    public static Map<Boolean, List<Person>> OldVersionPartitionAdults(List<Person> people) {
        Map<Boolean, List<Person>> map = new HashMap<>();
        map.put(true, new ArrayList<>());
        map.put(false, new ArrayList<>());
        for (Person person : people) {
            map.get(person.getAge() >= 18).add(person);
        }
        return map;
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        return people.stream()
                .collect(Collectors.partitioningBy(person -> person.getAge() >= 18, Collectors.toList()));
    }
}
