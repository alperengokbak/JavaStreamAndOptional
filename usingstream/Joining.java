import models.Person;

import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    public static String OldVersionNamesToString(List<Person> people) {
        String label = "Names: ";
        StringBuilder sb = new StringBuilder(label);
        for (Person person : people) {
            if (sb.length() > label.length()) {
                sb.append(", ");
            }
            sb.append(person.getName());
        }
        sb.append(".");
        return sb.toString();
    }

    public static String namesToString(List<Person> people) {
        return people.stream().map(Person::getName).collect(Collectors.joining(", ", "Names: ", "."));
    }

    public static String namesToString2(List<Person> people) {
        return "Names: " + people.stream()
                .map(Person::getName)
                .reduce((letter, sum) -> letter + "i" + sum)
                .orElse("")
                + ".";
    }
}
