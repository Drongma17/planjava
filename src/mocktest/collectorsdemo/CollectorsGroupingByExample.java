package mocktest.collectorsdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupingByExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Anna");
        Map<Character, List<String>> groupedByInitial = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println(groupedByInitial);
        // Output: {A=[Alice, Anna], B=[Bob], C=[Charlie]}
    }
}