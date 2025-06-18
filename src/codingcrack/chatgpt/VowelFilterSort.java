package codingcrack.chatgpt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class VowelFilterSort {

    public static List<String> filterAndSort(List<String> input) {
        return input.stream()
                .filter(s -> s.matches("(?i)^[aeiou].*")) // filter strings starting with vowel
                .sorted(Comparator.reverseOrder())        // reverse alphabetical order
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "umbrella", "grape", "Avocado");
        List<String> result = filterAndSort(words);
        System.out.println("Filtered and sorted list: " + result);
    }


    public void returnStringArgs(){
        String name = "Ngawang Yeshi";
        char[] chas = name.toCharArray();
        List<Character> charList = new ArrayList<>();
        for (Character chrr : chas){
            charList.add(chrr);
        }
    }


}