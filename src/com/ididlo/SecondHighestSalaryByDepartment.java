package com.ididlo;

import java.util.*;
import java.util.stream.Collectors;

class Employee1 {
    String name;
    String department;
    double salary;

    Employee1(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (" + department + ") - $" + salary;
    }
}

public class SecondHighestSalaryByDepartment {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
            new Employee1("Alice", "HR", 50000),
            new Employee1("Bob", "HR", 60000),
            new Employee1("Charlie", "IT", 70000),
            new Employee1("David", "IT", 80000),
            new Employee1("Eve", "Finance", 75000),
            new Employee1("Frank", "Finance", 72000)
        );

        Map<String, Optional<Employee1>> secondHighestByDept = employees.stream()
            .collect(Collectors.groupingBy(
                e -> e.department,
                Collectors.collectingAndThen(
                    Collectors.toList(),
                    list -> list.stream()
                        .sorted(Comparator.comparingDouble(Employee1::getSalary).reversed())
                        .skip(1)
                        .findFirst()
                )
            ));

        secondHighestByDept.forEach((dept, emp) ->
            System.out.println("Department: " + dept + ", Second Highest Paid: " + emp.orElse(null))
        );
    }
}
