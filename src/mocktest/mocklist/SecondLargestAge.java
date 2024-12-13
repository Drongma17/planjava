package mocktest.mocklist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestAge {
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> persons = Arrays.asList(
                new Person("Alice", 34),
                new Person("Bob", 45),
                new Person("Charlie", 23),
                new Person("Diana", 45), // Duplicate age
                new Person("Eve", 30)
        );

        // Find the second largest age
        Optional<Integer> secondLargestAge = persons.stream()
                .map(Person::getAge)                     // Extract ages
                .distinct()                              // Remove duplicates
                .sorted(Comparator.reverseOrder())       // Sort in descending order
                .skip(1)                                 // Skip the first (largest age)
                .findFirst();                            // Get the second largest age

        // Print the result
        if (secondLargestAge.isPresent()) {
            System.out.println("Second Largest Age: " + secondLargestAge.get());
        } else {
            System.out.println("No second largest age found.");
        }
    }
}