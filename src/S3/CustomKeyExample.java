package S3;

import java.util.HashMap;

public class CustomKeyExample {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Alice", 30);

        map.put(person1, "Software Engineer");
        map.put(person2, "Data Scientist");

        System.out.println(map.get(person1)); // Output: Software Engineer
        System.out.println(map.get(person2)); // Output: Data Scientist
    }
}