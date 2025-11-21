package codingcrack.coderbyte;

public class RunLengthEncoder {

    public static String RunLength(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        
        StringBuilder result = new StringBuilder();
        int count = 1;
        char currentChar = str.charAt(0);
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                result.append(count).append(currentChar);
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        
        // Append the last character sequence
        result.append(count).append(currentChar);
        
        return result.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(RunLength("aabbcde"));    // Output: 2a2b1c1d1e
        System.out.println(RunLength("wwwbbbw"));    // Output: 3w3b1w
        System.out.println(RunLength("wwwggopp"));   // Output: 3w2g1o2p
    }
}