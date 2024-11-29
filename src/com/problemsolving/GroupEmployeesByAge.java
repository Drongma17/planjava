package com.problemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


 class Employee {

    private int id;

    private String name;

    private Integer age;

    public Employee(int id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "GroupByAge{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



public class GroupEmployeesByAge {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Ngawang", 42),
                new Employee(2, "Yeshi", 42),
                new Employee(3, "Pema", 3),
                new Employee(4, "Kunsang", 4),
                new Employee(5, "Dolma", 41),
                new Employee(6, "Pasang", 3),
                new Employee(7, "Phuntsok", 4),
                new Employee(8, "Sonam", 41),
                new Employee(9, "Dolker", 41)
        );

        Map<Integer, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(emp -> emp.getAge()));
        System.out.println();
        map.forEach((key, value)->{
            System.out.print("Age  "+ key );
            System.out.println("   =>   "+ value);
        });

    }
}
