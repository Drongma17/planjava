package com.interview.linkdin.hashDemo;

import java.util.HashMap;
import java.util.HashSet;

public class EmpAlgorithm {

    public static void main(String[] args) {
        Employee employee = new Employee("Ngawang",3260, "CSE");
        Employee employee1 = new Employee("Sonam",3256, "MES");
        Employee employee2 = new Employee("Dolma",4335, "EEE");
        Employee employee3 = new Employee("Dawa",3564, "ISE");
        Employee employee4 = new Employee("Tashi",5454, "NSR");

        HashMap<Integer, Employee> employeeById= new HashMap<>();
        employeeById.put(employee.id, employee);
        employeeById.put(employee1.id, employee1);
        employeeById.put(employee2.id, employee2);
        employeeById.put(employee3.id, employee3);
        employeeById.put(employee4.id, employee4);


        Employee retrivedEmployee=employeeById.get(3260);
        if (retrivedEmployee !=null){
            System.out.println(retrivedEmployee.name + " === " + retrivedEmployee.id);
        }

        HashSet<String> productCode = new HashSet<>();
        productCode.add("2T4FSG");
        productCode.add("STS533");
        productCode.add("SFDY3454");
        productCode.add("34LSF5");
        productCode.add("SE3S6S");

        System.out.println(productCode.contains("2T4FSG"));
        System.out.println(productCode.contains("2T4FS35"));
    }
}
