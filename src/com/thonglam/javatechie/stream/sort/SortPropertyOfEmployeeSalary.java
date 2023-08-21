package com.thonglam.javatechie.stream.sort;

import com.thonglam.javatechie.streamapiexample.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortPropertyOfEmployeeSalary {


    public static void main(String[] args) {


        List<Employee> employees = DataBase.getEmployee();

//        Traditional way

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int) (o1.getSalary() - o2.getSalary());
//            }
//        });


//        lamda expression

//        Collections.sort(employees, (o1, o2)-> (int) (o1.getSalary() - o2.getSalary()));
//        System.out.println(employees);


//        by using functional interface
 //       employees.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).forEach(System.out::println);


        employees.stream().sorted(Comparator.comparing(emp-> emp.getSalary())).forEach(System.out::println);
        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
    }
}
