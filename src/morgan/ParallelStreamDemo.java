package morgan;

import java.util.Arrays;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        // Create a list of integers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Calculate the sum of squares using parallel stream
        long sum = Arrays.stream(numbers)
                         .parallel() // Convert stream to parallel stream
                         .mapToLong(x -> x * x) // Calculate square of each element
                         .sum(); // Sum up the squares

        System.out.println("Sum of squares (parallel): " + sum);
    }
}