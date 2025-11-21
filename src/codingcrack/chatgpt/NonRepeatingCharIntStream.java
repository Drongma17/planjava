package codingcrack.chatgpt;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NonRepeatingCharIntStream {
    public static void main(String[] args) {
        String str = "aaabbbababagaagdfvvsddaftyl";
        
        // Using IntStream for better performance
        Character firstNonRepeating = IntStream.range(0, str.length())
            .mapToObj(str::charAt)
            .collect(Collectors.collectingAndThen(
                Collectors.groupingBy(
                    Function.identity(),
                    LinkedHashMap::new,
                    Collectors.counting()
                ),
                map -> map.entrySet().stream()
                    .filter(entry -> entry.getValue() == 1)
                    .findFirst()
                    .map(Map.Entry::getKey)
                    .orElse(null)
            ));
        
        System.out.println("First non-repeating character: " + firstNonRepeating);
    }
}