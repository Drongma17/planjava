package qualityassurance;

public class Task3 {

    // Return the number of vowels in the given string.
    public static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Java Developer")); // Output: 6
    }
}