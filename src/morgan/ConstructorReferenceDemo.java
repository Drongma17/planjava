package morgan;

import java.util.function.Supplier;

public class ConstructorReferenceDemo {

    // Define a simple class
    static class MyClass {
        private String message;

        MyClass(String message) {
            this.message = message;
        }

        public MyClass() {
        }

        public String getMessage() {
            return message;
        }
    }

    public static void main(String[] args) {
        // Using constructor reference to create a new instance of MyClass
        Supplier<MyClass> supplier = MyClass::new;
        
        // Getting instance using supplier
        MyClass instance = supplier.get();
        
        // Outputting message from MyClass instance
        System.out.println(instance.getMessage());
    }
}