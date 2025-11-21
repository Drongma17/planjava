package morgan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipDemo {


        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            // Skip the first 5 elements
            List<Integer> remainingNumbers = numbers.stream()
                    .skip(5)
                    .collect(Collectors.toList());

            System.out.println(remainingNumbers); // Output: [6, 7, 8, 9, 10]
        }
    }

