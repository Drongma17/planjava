package morgan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {

        public static void main(String[] args) {
            List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie", "David");

            // Filter names starting with 'A' and collect them into a new list
            List<String> filteredNames = names.stream()
                    .filter(name -> name.startsWith("A"))
                    .collect(Collectors.toList());

            System.out.println(filteredNames); // Output: [Alice]
        }
    }

