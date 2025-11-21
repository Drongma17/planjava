package com.ididlo;

import java.util.*;
import java.util.stream.Collectors;

public class MyTest {

    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
                new Employee1("Alice", "HR", 50000),
                new Employee1("Bob", "HR", 60000),
                new Employee1("Charlie", "IT", 70000),
                new Employee1("David", "IT", 80000),
                new Employee1("Eve", "Finance", 75000)
        );


        Map<String, Optional<Employee1>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.department,
                Collectors.maxBy(Comparator.comparingDouble(e -> e.salary))
        ));

        System.out.println(collect);
    }
}
