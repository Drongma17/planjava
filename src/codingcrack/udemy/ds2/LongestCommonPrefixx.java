package codingcrack.udemy.ds2;

public class LongestCommonPrefixx {


    public static String longestCommonPrefix(String[] str) {
        if (str.length == 0) return null;
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
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
