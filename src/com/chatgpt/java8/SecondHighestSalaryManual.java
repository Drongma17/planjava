package com.chatgpt.java8;

import java.util.*;

public class SecondHighestSalaryManual {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 80000),
            new Employee("Bob", 95000),
            new Employee("Charlie", 120000),
            new Employee("Diana", 95000),
            new Employee("Eve", 70000)
        );

        Set<Double> salarySet = new TreeSet<>(Collections.reverseOrder());
        for (Employee e : employees) {
            salarySet.add(e.getSalary());
        }

        Iterator<Double> iterator = salarySet.iterator();
        if (iterator.hasNext()) iterator.next(); // first
        if (iterator.hasNext()) {
            System.out.println("Second highest salary: $" + iterator.next());
        } else {
            System.out.println("Not enough unique salaries.");
        }
    }
}
