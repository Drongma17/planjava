package com.thonglam.javatechie.mapreduce.mrimplement2;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class MapReduceExample {


    public static void main(String[] args) {


        double  average = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();
        System.out.println(average);


        double salary = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i->i)
                .average().getAsDouble();


        double sumSalary = EmployeeDatabase.getEmployees()
                .stream().filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i->i)
                .sum();
       // System.out.println(sumSalary);

        System.out.println(EmployeeDatabase.getEmployees().stream().filter(empl->empl.getSalary()>80000).collect(Collectors.groupingBy(emp->emp.getName())));
        System.out.println(EmployeeDatabase.getEmployees().stream().filter(empl->empl.getSalary()>80000).collect(Collectors.groupingBy(emp->emp.getName(), Collectors.counting())));


        System.out.println();
        Iterable<String> iterable= Arrays.asList("java 8", "Stream", "Interview Questions");

        StreamSupport.stream(iterable.spliterator(), false).forEach(System.out::println);

    }
}
