package morgan;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemos {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

            // Example 1: Reduce to sum of elements
            Optional<Integer> sum = numbers.stream()
                    .reduce(Integer::sum);

            System.out.println("Sum: " + sum.orElse(0)); // Output: Sum: 15

            // Example 2: Reduce with initial value (10) to find the product
            Integer product = numbers.stream()
                    .reduce(10, (a, b) -> a * b);

            System.out.println("Product: " + product); // Output: Product: 1200

    }
}
