package mocktest.collectorsdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsReducingExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                         .collect(Collectors.reducing(0, Integer::sum));

        System.out.println(sum); // Output: 15
    }
}

