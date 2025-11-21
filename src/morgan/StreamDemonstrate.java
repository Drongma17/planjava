package morgan;

import java.util.Arrays;
import java.util.List;

public class StreamDemonstrate {


        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            // Example 1: Filtering even numbers
            numbers.stream()
                    .filter(num -> num % 2 == 0)
                    .forEach(System.out::println);

            // Example 2: Mapping numbers to their squares
            numbers.stream()
                    .map(num -> num * num)
                    .forEach(System.out::println);

            // Example 3: Reducing numbers to their sum
            int sum = numbers.stream()
                    .reduce(0, Integer::sum);
            System.out.println("Sum: " + sum);
        }
    }

