import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    //Nested List
    public static List<String> transformWithForLoop(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            newCollection.addAll(subCollection);
        }
        return newCollection;
    }

    /*
    We have a nested list as like parameter. Firstly, we need to create Stream<person>. And after that, that nested list should
    divide from each other. We should use flatMap() function to do that process. And lastly, we need to return a list.
    */
    public static List<String> transformWithStream(List<List<String>> collection) {
        return collection.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
