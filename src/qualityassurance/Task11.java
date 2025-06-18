package qualityassurance;

public class Task11 {

    // Count the number of words in a sentence.
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        System.out.println(countWords("This is a test sentence")); // Output: 5
    }
}