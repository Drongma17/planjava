package qualityassurance;

import java.util.Arrays;

public class Welcome {
    public static void main(String[] args) {
        String a = "Welcome";
        String b = new String("Welcome");

        System.out.println("a == b : " + (a == b));               // Reference comparison
        System.out.println("a.equals(b) : " + a.equals(b));       // Value comparison

        String[] arr = {"a", "b", "c"};
        System.out.println("Array: " + Arrays.toString(arr));     // Prints array contents
    }
}