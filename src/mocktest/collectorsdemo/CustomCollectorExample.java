package mocktest.collectorsdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


 /*
 Collector Method	Purpose
Collectors.toList()	Collect elements into a List.
Collectors.toSet()	Collect elements into a Set.
Collectors.toMap()	Collect elements into a Map.
Collectors.groupingBy()	Group elements by a key.
Collectors.partitioningBy()	Partition elements based on a predicate.
Collectors.joining()	Concatenate elements into a String.
Collectors.counting()	Count the number of elements.
Collectors.summarizingInt()	Collect summary statistics for integers.
Collectors.mapping()	Map elements and collect the results.
Collectors.reducing()	Perform a reduction operation.
  */




public class CustomCollectorExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        
        // Custom collector to concatenate strings
        String concatenatedNames = names.stream()
                                        .collect(Collector.of(
                                            StringBuilder::new, 
                                            (sb, name) -> sb.append(name).append("-"),
                                            StringBuilder::append,
                                            sb -> sb.toString()
                                        ));

        System.out.println(concatenatedNames); // Output: Alice-Bob-Charlie-
    }
}