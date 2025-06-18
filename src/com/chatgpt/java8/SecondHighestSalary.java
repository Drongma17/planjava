package com.chatgpt.java8;

import java.util.*;
import java.util.stream.*;

public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 80000),
            new Employee("Bob", 95000),
            new Employee("Charlie", 120000),
            new Employee("Diana", 95000),
            new Employee("Eve", 70000)
        );

        // Remove duplicates, sort descending, skip 1st, take 1
        OptionalDouble secondHighestSalary = employees.stream()
            .map(Employee::getSalary)
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst()
            .map(OptionalDouble::of)
            .orElse(OptionalDouble.empty());

        if (secondHighestSalary.isPresent()) {
            System.out.println("Second highest salary: $" + secondHighestSalary.getAsDouble());
        } else {
            System.out.println("Not enough unique salaries to determine second highest.");
        }
    }
}
