package codingcrack.chatgpt;

import java.util.LinkedHashMap;
import java.util.Map;

public class SecondRepeatingCharacter {
    public static void main(String[] args) {
        String input = "Ngawang Yeshi";
        Character secondRepeating = findSecondRepeatingChar(input);
        
        if (secondRepeating != null) {
            System.out.println("Second repeating character: " + secondRepeating);
        } else {
            System.out.println("No second repeating character found.");
        }
    }

    public static Character findSecondRepeatingChar(String str) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            if (c != ' ') { // ignore spaces
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        int count = 0;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                count++;
                if (count == 2) {
                    return entry.getKey();
                }
            }
        }

        return null; // no second repeating character found
    }
}