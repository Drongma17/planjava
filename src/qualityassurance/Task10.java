package qualityassurance;

public class Task10 {

    // Check if all characters in the string are unique.
    public static boolean allUnique(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(allUnique("hello")); // Output: false
    }
}