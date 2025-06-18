package qualityassurance;

public class Task1 {

    // Given a string, return a version where all the "x" have been removed,
    // except for "x" at the very start or end should not be removed.
    public static String removeX(String str) {
        if (str.length() <= 2) {
            return str;
        }

        String mid = str.substring(1, str.length() - 1).replace("x", "");
        System.out.println(str.charAt(str.length()-1));
        return str.charAt(0) + mid + str.charAt(str.length() - 1);
    }

    public static void main(String[] args) {
        String input = "xHxix";
        System.out.println(removeX(input));
    }
}