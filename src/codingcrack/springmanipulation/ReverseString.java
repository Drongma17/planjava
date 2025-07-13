package codingcrack.springmanipulation;

public class ReverseString {
    public static void main(String[] args) {
        String input = "hello";
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed: " + reversed); // Output: olleh
    }
}