package morgan;

import java.util.Arrays;
import java.util.Comparator;

public class InstanceMethodReferenceExample {

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};

        // Using lambda expression
        Arrays.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted names: " + Arrays.toString(names));

        // Using instance method reference
        Arrays.sort(names, String::compareTo);
        System.out.println("Sorted names: " + Arrays.toString(names));
    }
}