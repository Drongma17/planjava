package codingcrack.chatgpt;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " (" + department + ") - $" + salary;
    }
}

public class SmallestSalaryByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "IT", 60000),
            new Employee("Bob", "IT", 55000),
            new Employee("Charlie", "HR", 40000),
            new Employee("David", "HR", 42000),
            new Employee("Eve", "Finance", 50000),
            new Employee("Frank", "Finance", 47000)
        );

        // Group by department and get the employee with the smallest salary
        Map<String, Employee> lowestPaidByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.collectingAndThen(
                    Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)),
                    Optional::get // safe since list has data
                )
            ));

        employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.collectingAndThen(
                        Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)),
                        Optional::get
                )
        ));

        Map<String, Optional<Employee>> collects = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))
        ));



        Map<String, Employee> highestPaidByDepart = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                        Optional::get
                        )
                ));



        // Print result
        lowestPaidByDept.forEach((dept, emp) -> 
            System.out.println("Department: " + dept + ", Lowest Paid: " + emp)
        );

        System.out.println();
        System.out.println();
        collects.forEach((x, y)-> System.out.println(x + " department has  = "+ y.get()));
    }
}