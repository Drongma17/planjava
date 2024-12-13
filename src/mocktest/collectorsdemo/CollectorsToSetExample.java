package mocktest.collectorsdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsToSetExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice");
        Set<String> collectedNames = names.stream()
                                          .collect(Collectors.toSet());

        System.out.println(collectedNames); // Output: [Alice, Bob, Charlie]
    }
}