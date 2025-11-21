package eazybyte.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectingAndThenEx {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        // Example: Collect elements into a List and then find the size
        int sizeOfList = words.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        List::size
                ));

        System.out.println("Size of List: " + sizeOfList); // Output: Size of List: 3
    }
}
