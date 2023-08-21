package com.thonglam.javatechie.mapreduce.mrimplement2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {


    public static List<Employee> getEmployees(){
      return  Stream.of(
              new Employee(101,"john","A",60000),
              new Employee(109,"peter","B",30000),
              new Employee(111,"mak","A",80005),
              new Employee(112,"mak","B",80500),
              new Employee(113,"mak","C",85000),
              new Employee(103,"kim","A",90000),
              new Employee(104,"kim","B",100000),
              new Employee(105,"kim","C",95000),
              new Employee(107,"kim","C",85000),
              new Employee(106,"json","C",15000))
              .collect(Collectors.toList());
    }
}