package morgan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Demonstrates finding the second highest salary from each department
 * using Java 8 Streams, Collectors.groupingBy, and custom sorting/skipping.
 */

// 1. Employee Data Structure
class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " (" + department + ", $" + salary + ")";
    }
}

public class SecondHighestSalary {

    public static void main(String[] args) {
        // Sample dataset with duplicate salaries and departments
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 60000.00), // 3rd in HR
            new Employee("Bob", "HR", 95000.00),   // 1st in HR
            new Employee("Charlie", "HR", 80000.00), // 2nd in HR (Target)
            new Employee("David", "IT", 120000.00), // 1st in IT
            new Employee("Eve", "IT", 100000.00),   // 2nd in IT (Target)
            new Employee("Frank", "IT", 100000.00), // Also 2nd in IT (Duplicate salary handled)
            new Employee("Grace", "SALES", 70000.00), // 1st in SALES
            new Employee("Heidi", "SALES", 70000.00) // Also 1st in SALES (No 2nd highest, returns Optional.empty)
        );

        System.out.println("--- Employee Data ---");
        employees.forEach(System.out::println);
        System.out.println("\n");

        // The core Java 8 Stream logic
        Map<String, Optional<Double>> secondHighestSalaries = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment, // Group by Department
                Collectors.collectingAndThen( // Apply a final transformation to each group
                    // Downstream Collector 1: Collect all salaries into a List<Double>
                    Collectors.mapping(Employee::getSalary, Collectors.toList()),
                    
                    // Downstream Collector 2 (Finisher): Find the second highest salary
                    salaries -> salaries.stream()
                        .sorted(Comparator.reverseOrder()) // Sort salaries high to low
                        .distinct()                      // IMPORTANT: Handle duplicate highest salaries correctly
                        .skip(1)                         // Skip the 1st highest salary
                        .findFirst()                     // Get the 2nd highest (if present)
                )
            ));

        System.out.println("--- Second Highest Salary per Department ---");
        secondHighestSalaries.forEach((department, salaryOpt) -> {
            String salaryStr = salaryOpt.map(s -> String.format("$%.2f", s)).orElse("N/A (Fewer than 2 distinct salaries)");
            System.out.println(String.format("Department: %-8s | Second Highest Salary: %s", department, salaryStr));
        });

        /*
        Expected Output:
        HR    : $80000.00 (Charlie)
        IT    : $100000.00 (Eve/Frank)
        SALES : N/A (Only one distinct salary $70000.00)
        */
    }
}