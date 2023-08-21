package com.thonglam.javatechie.stream.sort;

import com.thonglam.javatechie.streamapiexample.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortPropertyOfObject {

    public static void main(String[] args) {


        List<Employee> employees = DataBase.getEmployee();

        Collections.sort(employees, new MyComparator());
        System.out.println(employees);
    }
}


class MyComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}