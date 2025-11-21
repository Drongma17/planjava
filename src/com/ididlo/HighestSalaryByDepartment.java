package com.ididlo;

import java.util.*;
import java.util.stream.Collectors;

class Employee implements Comparable<Employee> {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
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

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}

public class HighestSalaryByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Charlie", "IT", 70000),
                new Employee("David", "IT", 80000),
                new Employee("Eve", "Finance", 75000),
                new Employee("Alice", "HR", 50000),
                new Employee("Bob", "HR", 60000)
        );


        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
             Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));


        Collections.sort(employees);
        System.out.println(employees);


        Map<String, Optional<Employee>> highestPaidByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.department,
                        Collectors.maxBy(Comparator.comparingDouble(e -> e.salary))
                ));

        highestPaidByDept.forEach((dept, emp) ->
                System.out.println("Department: " + dept + ", Highest Paid: " + emp.orElse(null))
        );


        Map<String, Employee> highestSalaryByDept2 = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                Optional::get
                        )
                ));

        System.out.println(highestSalaryByDept2);

    }
}
