package mocktest.collectorsdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsMappingExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Set<Integer> nameLengths = names.stream()
                                        .collect(Collectors.mapping(String::length, Collectors.toSet()));

        System.out.println(nameLengths); // Output: [3, 5, 7]
    }
}