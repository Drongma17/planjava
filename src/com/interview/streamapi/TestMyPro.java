package com.interview.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class TestMyPro {

    static List<Employee> employeeList =EmployeeStreamDemo.employeeList;
    public static void main(String[] args) {
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));

        TestMyPro.method14();
    }



    public static void method3() {
        System.out.println("Query 3 : What is the average age of male and female employees?");
        Map<String, Double> averageAgeOfMaleAndFemaleEmployee = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(averageAgeOfMaleAndFemaleEmployee);
    }



    public static void method4() {
        System.out.println("Query 4 : Get the details of highest paid employee in the organization?");
        Optional<Employee> getHigestPay=employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(getHigestPay);

    }


    public static void method5() {
        System.out.println("Query 5 : Get the names of all employees who have joined after 2015?");
       employeeList.stream().filter(emp->emp.getYearOfJoining()>2015).map(Employee::getName).forEach(System.out::println);
    }


    public static void method6() {
        System.out.println("Query 6 : Count the number of employees in each department?");
        Map<String, Long> employeeCountByDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        Set<Map.Entry<String, Long>> display=employeeCountByDepartment.entrySet();
        for(Map.Entry<String, Long> employee: display){
            System.out.println(employee.getKey() + "    "+ employee.getValue());
        }
    }




    public static void method8() {
        System.out
                .println("Query 8 : Get the details of youngest male employee in the product development department?");
        Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper=
                employeeList.stream()
                        .filter(e -> e.getGender()=="Male" && e.getDepartment()=="Product Development")
                        .min(Comparator.comparingInt(Employee::getAge));

        Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();

        System.out.println("Details Of Youngest Male Employee In Product Development");

        System.out.println("----------------------------------------------");

        System.out.println("ID : "+youngestMaleEmployeeInProductDevelopment.getId());

        System.out.println("Name : "+youngestMaleEmployeeInProductDevelopment.getName());

    }




    public static void method9() {
        System.out.println("Query 9 : Who has the most working experience in the organization?");
      Optional<Employee> employee=   employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst();
      Employee employee1 = employee.get();
        System.out.println(employee1);

    }


    public static void method10() {
        System.out.println("Query 10 : How many male and female employees are there in the sales and marketing team?");

        Map<String, Long> countMaleFemaleEmployeesInSalesMarketing=
                employeeList.stream()
                        .filter(e -> e.getDepartment()=="Sales And Marketing")
                        .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(countMaleFemaleEmployeesInSalesMarketing);
    }




    public static void method11() {
        System.out.println("Query 11 : What is the average salary of male and female employees?");
        Map<String, Double> avgSalaryOfMaleAndFemaleEmployees=
                employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(avgSalaryOfMaleAndFemaleEmployees);
    }




    public static void method12() {
        System.out.println("Query 12 : List down the names of all employees in each department?");
      Map<String, List<Employee>>  employeesInDepartment = employeeList.stream()
              .collect(Collectors.groupingBy(Employee::getDepartment));

        Set<Map.Entry<String, List<Employee>>>  emps = employeesInDepartment.entrySet();

        for (Map.Entry<String, List<Employee>> listemps: emps){
            System.out.println();
            System.out.println("DEPARTMENT  ===  " + listemps.getKey());
            List<Employee>  emp = listemps.getValue();
            System.out.print("EMPLOYEE :: ");
            for(Employee em: emp){
                System.out.print( em.getName()+",  ");
            }
            System.out.println();
        }

    }



    public static void method13() {
        System.out.println("Query 13 : What is the average salary and total salary of the whole organization?");
        DoubleSummaryStatistics  averageAndTotal = employeeList.stream()
                 .collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println(averageAndTotal.getAverage());
        System.out.println(averageAndTotal.getSum());
    }




    public static void method14() {
        System.out.println(
                "Query 14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.");

        Map<Boolean, List<Employee>> partitionEmployeesByAge=
                employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));

        Set<Map.Entry<Boolean,  List<Employee>>> emps = partitionEmployeesByAge.entrySet();
        for (Map.Entry<Boolean, List<Employee>>  emp: emps){
            System.out.print(emp.getKey() +"   ");

            List<Employee>  employees = emp.getValue();

            for(Employee employee: employees){
                System.out.print(employee.getName()+ ",  ");
            }
        }
    }


    public static void method15() {
        System.out.println(
                "Query 15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?");

    }
}
