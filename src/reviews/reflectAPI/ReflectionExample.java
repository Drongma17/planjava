package reviews.reflectAPI;

import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // Get the class object
        Class<?> clazz = String.class;

        // Get the method object
        Method method = clazz.getMethod("toUpperCase");

        // Create a string object
        String str = "hello";

        // Invoke the method dynamically
        String result = (String) method.invoke(str);

        System.out.println(result); // Output: HELLO
    }
}