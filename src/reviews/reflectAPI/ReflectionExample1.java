package reviews.reflectAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class ReflectionExample1 {
    public static void main(String[] args) throws Exception {
        // Get the class object
        Class<?> clazz = Employee.class;

        // Create an instance using the constructor
        Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
        Employee employee = (Employee) constructor.newInstance("John Doe", 30);

        // Invoke the displayInfo method
        Method method = clazz.getMethod("displayInfo");
        method.invoke(employee);

        // Get the name field and set its value
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(employee, "Jane Doe");

        // Invoke the displayInfo method again
        method.invoke(employee);

        // Get the age field and get its value
        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);
        int age = (int) ageField.get(employee);
        System.out.println("Age: " + age);
    }
}


