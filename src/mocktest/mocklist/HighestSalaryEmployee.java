package mocktest.mocklist;

import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return name + " (" + department + ") - $" + salary;
    }
}

public class HighestSalaryEmployee {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "IT", 90000),
            new Employee("Bob", "HR", 75000),
            new Employee("Charlie", "IT", 95000),
            new Employee("David", "Finance", 88000),
            new Employee("Eve", "HR", 78000),
            new Employee("Frank", "Finance", 91000)
        );

        Map<String, Optional<Employee>> highestPaid = employees.stream()
            .collect(Collectors.groupingBy(
                e -> e.department,
                Collectors.maxBy(Comparator.comparingDouble(e -> e.salary))
            ));

        // Print results
        highestPaid.forEach((dept, empOpt) ->
            System.out.println(dept + " -> " + empOpt.orElse(null))
        );
    }
}