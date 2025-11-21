package morgan;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDemo {


        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "cherry", "blueberry", "avocado");

            Map<Character, List<String>> groupedByFirstLetter = words.stream()
                    .collect(Collectors.groupingBy(word -> word.charAt(0)));

            System.out.println("Grouped by first letter: " + groupedByFirstLetter);
        }
    }

