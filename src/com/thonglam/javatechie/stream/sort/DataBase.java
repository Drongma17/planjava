package com.thonglam.javatechie.stream.sort;

import com.thonglam.javatechie.streamapiexample.Employee;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public static List<com.thonglam.javatechie.streamapiexample.Employee> getEmployee(){
        List<com.thonglam.javatechie.streamapiexample.Employee>  list = new ArrayList<>();

        list.add(new Employee(176, "Tashi", "Teacher", 16000));
        list.add(new Employee(178, "Sonam", "Officer", 80000));
        list.add(new Employee(173, "Dorjee", "Driver", 58000));
        list.add(new Employee(3260, "Ngawnag", "IT", 90000));
        list.add(new Employee(456, "Pasang", "Nursing", 5000));
        list.add(new Employee(186, "Penpa", "Accountance", 9045));
        list.add(new Employee(172, "Norbu", "Securiry", 86000));
        return list;
    }
}
