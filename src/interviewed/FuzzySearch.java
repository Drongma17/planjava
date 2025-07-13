package interviewed;

import java.util.*;

public class FuzzySearch {

    public static void main(String[] args) {
        List<String> dictionary = Arrays.asList(
            "apple", "apples", "ape", "aple", "maple", "ample", "apply", "banana", "orange"
        );

        String query = "apple";

        List<String> matches = fuzzySearch(dictionary, query, 2);
        System.out.println("Matches: " + matches);
    }

    public static List<String> fuzzySearch(List<String> dictionary, String query, int maxDistance) {
        List<String> result = new ArrayList<>();
        for (String word : dictionary) {
            int distance = levenshteinDistance(word, query);
            if (distance <= maxDistance) {
                result.add(word);
            }
        }
        return result;
    }

    // Levenshtein Distance implementation
    public static int levenshteinDistance(String a, String b) {
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m + 1][n + 1];

        // Base cases
        for (int i = 0; i <= m; i++) dp[i][0] = i;
        for (int j = 0; j <= n; j++) dp[0][j] = j;

        // Fill the matrix
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int insert = dp[i][j - 1] + 1;
                    int delete = dp[i - 1][j] + 1;
                    int replace = dp[i - 1][j - 1] + 1;
                    dp[i][j] = Math.min(insert, Math.min(delete, replace));
                }
            }
        }

        return dp[m][n];
    }
}