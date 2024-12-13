package mocktest.collectorsdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoiningExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        String joinedNames = names.stream()
                                  .collect(Collectors.joining(", "));

        System.out.println(joinedNames); // Output: Alice, Bob, Charlie
    }
}