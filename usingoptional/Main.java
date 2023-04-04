import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Integer a = null;

        b(Optional.ofNullable(a));

        Optional<String> gender = Optional.of("Male");
        String name = null;

        c(name);

    }
    public static void b(Optional<Integer> param){
        param.ifPresent(System.out::println);
    } 

    public static void c(String name){
        Optional<String> nameOptional = Optional.ofNullable(name);
        nameOptional.ifPresent(System.out::println);
    }

    public static void printName(String name){
        Optional<String> nameOptional = Optional.of(name);
        try {
            System.out.println(nameOptional.map(s -> s.toUpperCase()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}