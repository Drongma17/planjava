package S3;

import java.util.*;
import java.util.stream.*;

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
        return name + " - " + salary;
    }
}

public class SecondHighestInDept {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("A", "IT", 5000),
            new Employee("B", "IT", 6000),
            new Employee("C", "IT", 4000),
            new Employee("D", "HR", 7000),
            new Employee("E", "HR", 6500),
            new Employee("F", "HR", 5000),
            new Employee("G", "Sales", 4000)
        );

        Map<String, Optional<Employee>> secondHighest =
            employees.stream()
                     .collect(Collectors.groupingBy(
                         Employee::getDepartment,
                         Collectors.collectingAndThen(
                             Collectors.toList(),
                             list -> list.stream()
                                         .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                                         .skip(1) // skip the highest
                                         .findFirst()
                         )
                     ));

        // Print result
        secondHighest.forEach((dept, emp) ->
            System.out.println(dept + " -> " + emp.orElse(null))
        );
    }
}
