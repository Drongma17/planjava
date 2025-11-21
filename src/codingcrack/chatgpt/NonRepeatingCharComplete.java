package codingcrack.chatgpt;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NonRepeatingCharComplete {
    public static void main(String[] args) {
        String str = "aaabbbababagaagdfvvsddaftyl";
        
        System.out.println("Original string: " + str);
        System.out.println("Length: " + str.length());
        
        // Approach 1: First non-repeating character
        System.out.println("\n=== Approach 1: First Non-Repeating Character ===");
        Character firstNonRepeat = findFirstNonRepeating(str);
        System.out.println("First non-repeating character: " + firstNonRepeat);
        
        // Approach 2: All non-repeating characters
        System.out.println("\n=== Approach 2: All Non-Repeating Characters ===");
        List<Character> allNonRepeating = findAllNonRepeating(str);
        System.out.println("All non-repeating characters: " + allNonRepeating);
        
        // Approach 3: Non-repeating characters with positions
        System.out.println("\n=== Approach 3: Non-Repeating with Positions ===");
        Map<Character, Integer> nonRepeatWithPositions = findNonRepeatingWithPositions(str);
        System.out.println("Non-repeating characters with first occurrence: " + nonRepeatWithPositions);
        
        // Approach 4: Frequency analysis
        System.out.println("\n=== Approach 4: Frequency Analysis ===");
        Map<Character, Long> frequencyMap = getCharacterFrequency(str);
        System.out.println("Character frequencies: " + frequencyMap);
    }
    
    // Approach 1: Find first non-repeating character
    public static Character findFirstNonRepeating(String str) {
        return str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.collectingAndThen(
                Collectors.groupingBy(
                    Function.identity(),
                    LinkedHashMap::new,
                    Collectors.counting()
                ),
                map -> map.entrySet().stream()
                    .filter(entry -> entry.getValue() == 1)
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElse(null)
            ));
    }
    
    // Approach 2: Find all non-repeating characters
    public static List<Character> findAllNonRepeating(String str) {
        Map<Character, Long> frequencyMap = str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
            ));
        
        return frequencyMap.entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .sorted() // Optional: sort the characters
            .collect(Collectors.toList());
    }
    
    // Approach 3: Find non-repeating characters with their first positions
    public static Map<Character, Integer> findNonRepeatingWithPositions(String str) {
        Map<Character, Long> frequencyMap = str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
            ));
        
        return IntStream.range(0, str.length())
            .mapToObj(i -> new AbstractMap.SimpleEntry<>(str.charAt(i), i))
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (existing, replacement) -> existing // Keep first occurrence
            ))
            .entrySet().stream()
            .filter(entry -> frequencyMap.get(entry.getKey()) == 1)
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue
            ));
    }
    
    // Approach 4: Get complete frequency map
    public static Map<Character, Long> getCharacterFrequency(String str) {
        return str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
            ))
            .entrySet().stream()
            .sorted(Map.Entry.comparingByKey()) // Sort by character
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            ));
    }
}