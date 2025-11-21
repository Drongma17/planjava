package eazybyte.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx1 {

    public static void main(String[] args) {
        List<List<Integer>> nestedLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        // Flatten the nested lists into a single list
        List<Integer> flattenedList = nestedLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flattenedList); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]z

    }
}
