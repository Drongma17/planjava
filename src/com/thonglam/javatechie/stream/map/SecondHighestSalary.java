package com.thonglam.javatechie.stream.map;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee1 {
    private int id;
    private String name;
    private String department;
    private int salary;

    public Employee1(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "', salary=" + salary + "}";
    }
}

public class SecondHighestSalary {
    public static void main(String[] args) {
        Map<Employee1, Integer> employeeMap = new HashMap<>();
        employeeMap.put(new Employee1(176, "Tashi", "Teacher", 16000), 60);
        employeeMap.put(new Employee1(178, "Sonam", "Officer", 80000), 90);
        employeeMap.put(new Employee1(173, "Dorjee", "Driver", 58000), 50);
        employeeMap.put(new Employee1(3260, "Ngawang", "IT", 90000), 50);
        employeeMap.put(new Employee1(456, "Pasang", "Nursing", 5000), 120);
        employeeMap.put(new Employee1(186, "Penpa", "Accountant", 9045), 150);
        employeeMap.put(new Employee1(172, "Norbu", "Security", 86000), 30);

        // Finding the second highest salary using Java 8 Streams
        List<Integer> salaries = employeeMap.keySet().stream()
                .map(Employee1::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .collect(Collectors.toList());

        if (salaries.size() < 2) {
            System.out.println("No second highest salary found.");
        } else {
            int secondHighestSalary = salaries.get(3); // Get second highest salary
            System.out.println("Second Highest Salary: " + secondHighestSalary);

            // Find employees with the second highest salary
            List<Employee1> employeesWithSecondHighestSalary = employeeMap.keySet().stream()
                    .filter(emp -> emp.getSalary() == secondHighestSalary)
                    .collect(Collectors.toList());

            System.out.println("Employees with Second Highest Salary: " + employeesWithSecondHighestSalary);
        }
    }
}