import java.util.Optional;

public class Main {
    public static void ifPresentExample(Optional<Integer> param){
        param.ifPresent(System.out::println);
    } 

    public static void ofNullableExample(String name){
        Optional<String> nameOptional = Optional.ofNullable(name);
        nameOptional.ifPresent(System.out::println);
    }

    public static void ofExample(String name){
        Optional<String> nameOptional = Optional.of(name);
        
        System.out.println(nameOptional.map(s -> s.toUpperCase()).orElse(name));
    }

    public static void main(String[] args) {
        String name = "Hello World";
        String name2 = null;

        ofExample(name2);
    }
}