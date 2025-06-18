package codingcrack.interviewquetions;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "name='" + name + '\'' +
               ", department='" + department + '\'' +
               ", salary=" + salary +
               '}';
    }
}

public class HighestSalaryByDept {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "IT", 90000),
            new Employee(2, "Bob", "HR", 75000),
            new Employee(3, "Charlie", "IT", 95000),
            new Employee(4, "David", "Finance", 80000),
            new Employee(5, "Eve", "HR", 82000)
        );

        // Group by department and find employee with max salary
        Map<String, Employee> highestPaidByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.collectingAndThen(
                    Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                    Optional::get
                )
            ));

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                Optional::get
                        ))
                        );

        // Print results
        highestPaidByDept.forEach((dept, emp) -> 
            System.out.println(dept + " => " + emp));
    }


    static void sentMessage(int i){

    }
}