package codingcrack.chatgpt;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SecondRepeatingCharjava8 {

    public static void main(String[] args) {
        String input = "Ngawang Yeshi";

//        Optional<Character> secondRepeatingChar = input
//                .toLowerCase() // ignore case
//                .chars()
//                .mapToObj(c -> (char) c)
//                .filter(Character::isLetter) // ignore spaces or non-letters
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(e -> e.getValue() > 1)
//                .skip(1) // skip first repeating
//                .map(Map.Entry::getKey)
//                .findFirst();

        IntStream chars = input.toLowerCase().chars();
        Stream<Character> characterStream = chars.mapToObj(c -> (char) c);
        Stream<Character> characterStream1 = characterStream.filter(Character::isLetter);
        LinkedHashMap<Character, Long> collect = characterStream1.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        Set<Map.Entry<Character, Long>> entries = collect.entrySet();
        Stream<Map.Entry<Character, Long>> stream = entries.stream();
        Stream<Map.Entry<Character, Long>> skip = stream.filter(e -> e.getValue() > 1).skip(1);
        Optional<Character> first = skip.map(Map.Entry::getKey).findFirst();

//        if (secondRepeatingChar.isPresent()) {
//            System.out.println("Second repeating character: " + secondRepeatingChar.get());
//        } else {
//            System.out.println("No second repeating character found.");
//        }
    }
}