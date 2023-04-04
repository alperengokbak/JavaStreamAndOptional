import java.util.*;
import java.util.stream.*;

public class UpperCase {
    public static Collection<String> OldVersionMapToUppercase(String... names) {
        Collection<String> uppercaseNames = new ArrayList<>();
        for(String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }

    public static Collection<String> mapToUppercase(String... names) {
        return Arrays.stream(names)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
    public  static Collection<String> mapToUppercaseWithFilter(String... names) {
        return Arrays.stream(names)
                .map(String::toUpperCase)
                .filter(name -> name.contains("A"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(mapToUppercase("Alperen", "Emine", "Ezgi", "Suat", "Hülya", "Oguzkagan"));
    }
}
