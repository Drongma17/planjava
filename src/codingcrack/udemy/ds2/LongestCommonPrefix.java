package codingcrack.udemy.ds2;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Start with the first string as the prefix
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix until the current string starts with it
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        String lcp = longestCommonPrefix(words);
        System.out.println("Longest Common Prefix: " + lcp);
    }
}