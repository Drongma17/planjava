package morgan;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstDemo {



        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

            // Find the first element in the stream
            Optional<Integer> firstElement = numbers.stream().findFirst();

            System.out.println("First Element: " + firstElement.orElse(null));
        }
    }


