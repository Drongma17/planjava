package codingcrack.optionalexample;

import java.util.*;
import java.util.stream.Collectors;

public class HighestSalaryByDept {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 50000),
            new Employee("Bob", "IT", 60000),
            new Employee("Charlie", "IT", 70000),
            new Employee("David", "HR", 55000),
            new Employee("Eve", "Sales", 45000),
            new Employee("Frank", "Sales", 65000)
        );

        Map<String, Employee> highestPaidByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.collectingAndThen(
                    Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                    Optional::get // safely get the max employee per dept
                )
            ));


        // Print results
        highestPaidByDept.forEach((dept, emp) ->
            System.out.println("Department: " + dept + " => " + emp)
        );
    }
}