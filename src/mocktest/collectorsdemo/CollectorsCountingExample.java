package mocktest.collectorsdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsCountingExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        long count = names.stream()
                          .collect(Collectors.counting());

        System.out.println(count); // Output: 3
    }
}