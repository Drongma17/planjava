package qualityassurance;

public class Task8 {

    // Return the first non-repeating character in the string.
    public static char firstNonRepeatingChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                return str.charAt(i);
            }
        }
        return '_'; // If none found
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("swiss")); // Output: w
    }
}