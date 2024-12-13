package mocktest.collectorsdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsToListExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> collectedNames = names.stream()
                                           .collect(Collectors.toList());

        System.out.println(collectedNames); // Output: [Alice, Bob, Charlie]
    }
}