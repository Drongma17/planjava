package morgan;

import java.util.Arrays;
import java.util.List;

public class AllMatchingDemo {


        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

            // Check if all elements are even
            boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);

            System.out.println("All elements are even: " + allEven);
        }
    }

