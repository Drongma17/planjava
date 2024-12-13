package mocktest.collectorsdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsPartitioningByExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> partitionedByEven = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        System.out.println(partitionedByEven);
        // Output: {false=[1, 3, 5], true=[2, 4, 6]}
    }
}