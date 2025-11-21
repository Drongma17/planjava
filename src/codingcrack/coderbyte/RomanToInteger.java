package codingcrack.coderbyte;

import java.util.HashMap;
import java.util.Map;


/*
Convert Roman Number to Numeric
 XVI to 16 , so roman number string to number conversion

IV should be 4
 */


public class RomanToInteger {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Traverse from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char cha = s.charAt(i);
            System.out.println(cha);
            int currentValue = romanMap.get(cha);

            if (currentValue < prevValue) {
                result -= currentValue;  // subtract if smaller before larger (IV, IX, etc.)
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("XVI = " + romanToInt("XVI")); // 16
        System.out.println("IV = " + romanToInt("IV"));   // 4
        System.out.println("MCMXCIV = " + romanToInt("MCMXCIV")); // 1994
    }
}