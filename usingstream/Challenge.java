import java.util.List;
import java.util.stream.Collectors;

public class Challenge {
    public static String getString(List<Integer> list) {
        return list.stream()
                .map(number -> (number % 2 == 0 ? "e" + number : "o" + number))
                .collect(Collectors.joining(","));
    }

    public static String getString2(List<Integer> list) {
        return list.stream()
                .map(number -> {
                    String num = "";
                    if (number % 2 == 0){
                        num += "e" + num;
                    }else{
                        num += "o" + num;
                    }
                    return num;
                }).collect(Collectors.joining(","));
    }
    /*
Write a method that returns a comma separated string based on a given list of integers. Each element should be preceded by the letter 'e' if the number is even, and preceded by the letter 'o'
if the number is odd. For example, if the input list is (3,44), the output should be 'o3,e44'. You can write this using only one operator and one collect statement. Go here and click 'Solution'
if you want to see the optimal solution.
    */
}
