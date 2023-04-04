import java.util.Arrays;

public class LetterCount {

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names)
                .parallel() // Provide to share the workload among many threads with each other.
                .filter(name -> name.length() > 5) // if(name.length() > 5)
                .mapToInt(String::length)
                .sum();
        /*
        First, we'll take array as like stream variable. In addition, we need to define the filter for that, so filter()
        method will do for use. Lastly, we need to return sum of the total number of letters.
        */
    }
    public static void main(String[] args) {
        System.out.println(getTotalNumberOfLettersOfNamesLongerThanFive("Alperen", "Emine", "Ezgi", "Suat", "Hülya", "Oguzkagan"));
    }
}
