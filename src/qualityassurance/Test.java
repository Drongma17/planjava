package qualityassurance;

public class Test {

    // Given a string, return a version where all the "x" have been removed.
    public static String removeX(String input) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (ch != 'x') {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abxcd";
        String output = removeX(input);
        System.out.println(output);  // Output: abcd
    }
}