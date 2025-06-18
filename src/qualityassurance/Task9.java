package qualityassurance;

public class Task9 {

    // Capitalize the first letter of each word in the string.
    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)))
              .append(word.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(capitalizeWords("java is fun")); // Output: Java Is Fun
    }
}