package qualityassurance;

public class Task2 {

    // Given a string, return its reverse.
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello")); // Output: olleh
    }
}