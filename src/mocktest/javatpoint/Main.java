package mocktest.javatpoint;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty.test("Hello, Java!"));
    }
}
