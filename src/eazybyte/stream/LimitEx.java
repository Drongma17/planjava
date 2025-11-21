package eazybyte.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitEx {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Limit to first 5 elements
        List<Integer> limitedNumbers = numbers.stream()
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(limitedNumbers); // Output: [1, 2, 3, 4, 5]
    }
}
