package com.thonglam.javatechie.stream.parallelvssequential;

import com.thonglam.javatechie.mapreduce.mrimplement2.Employee;
import com.thonglam.javatechie.mapreduce.mrimplement2.EmployeeDatabase;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void main(String[] args) {

        long start=0;
        long end =0;
        start = System.currentTimeMillis();
        IntStream.range(1,100).forEach(System.out::println);
        end=System.currentTimeMillis();
        System.out.println("Plain stream took time : "+ (end - start));


        System.out.println("=====================================");

        start = System.currentTimeMillis();
        IntStream.range(1,100).parallel().forEach(System.out::println);
        end=System.currentTimeMillis();
        System.out.println("Parallel stream took time : "+ (end - start));



        IntStream.range(1, 10).forEach(x->{
            System.out.println("Thread : "+ Thread.currentThread().getName()+"  "+x);
        });


        IntStream.range(1, 10).parallel().forEach(x->{
            System.out.println("Thread : "+ Thread.currentThread().getName()+"  "+x);
        });


        start = System.currentTimeMillis();
        List<Employee> employees = EmployeeDatabase.getEmployees();
        double salaryWithStream = employees.stream().map(Employee::getSalary)
                .mapToDouble(i -> i).average().getAsDouble();
        end=System.currentTimeMillis();
        System.out.println("Normal stream took time : "+ (end - start) + " Average Salary "+ salaryWithStream);


        start = System.currentTimeMillis();
        double salarywithParallelStream = employees.parallelStream().map(Employee::getSalary)
                .mapToDouble(i -> i).average().getAsDouble();
        end=System.currentTimeMillis();
        System.out.println("Parallel stream took time : "+ (end - start) + " Average Salary  "+ salarywithParallelStream);

    }
}
