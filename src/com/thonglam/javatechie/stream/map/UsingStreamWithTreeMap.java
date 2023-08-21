package com.thonglam.javatechie.stream.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class UsingStreamWithTreeMap {


    public static void main(String[] args) {

//        Traditional way of sorting
//        Map<Employee, Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int) (o1.getSalary() - o2.getSalary());
//            }
//        });


        Map<Employee, Integer> employeeMap = new TreeMap<>((o1,o2)->(int) (o1.getSalary() - o2.getSalary()));
        Map<Employee, Integer>  empmap = new TreeMap<>((ob1, ob2)-> (int) (ob1.getSalary() - ob2.getSalary()));

        employeeMap.put(new Employee(176, "Tashi", "Teacher", 16000), 60);
        employeeMap.put(new Employee(178, "Sonam", "Officer", 80000), 90);
        employeeMap.put(new Employee(173, "Dorjee", "Driver", 58000), 50);
        employeeMap.put(new Employee(3260, "Ngawnag", "IT", 90000), 50);
        employeeMap.put(new Employee(456, "Pasang", "Nursing", 5000), 120);
        employeeMap.put(new Employee(186, "Penpa", "Accountance", 9045), 150);
        employeeMap.put(new Employee(172, "Norbu", "Securiry", 86000), 30);

//        System.out.println(employeeMap);

         employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
//        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);
         empmap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
    }
}
