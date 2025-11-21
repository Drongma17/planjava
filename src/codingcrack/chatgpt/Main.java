package codingcrack.chatgpt;

import codingcrack.comparatorandrable.Employee;

import java.util.*;
import java.util.stream.*;

class Employee1 {
    private String name;
    private String dept;
    private double salary;

    public Employee1(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getDept() { return dept; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " (" + dept + ") : " + salary;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
            new Employee1("Alice", "IT", 60000),
            new Employee1("Bob", "IT", 55000),
            new Employee1("Charlie", "HR", 40000),
            new Employee1("David", "HR", 42000),
            new Employee1("Eve", "Finance", 50000),
            new Employee1("Frank", "Finance", 47000)
        );

        // Sort employees by salary in descending order
        List<Employee1> sorted = employees.stream()
            .sorted(Comparator.comparingDouble(Employee1::getSalary).reversed())
            .collect(Collectors.toList());

        if (sorted.size() >= 2) {
            Employee1 highest = sorted.get(0);
            Employee1 secondHighest = sorted.get(1);

            System.out.println("Highest Paid Employee: " + highest);
            System.out.println("Second Highest Paid Employee: " + secondHighest);
        } else {
            System.out.println("Not enough employees to determine top 2.");
        }

        System.out.println("================================");

       employees.stream().sorted(Comparator.comparingDouble(Employee1::getSalary).reversed()).skip(1).findFirst();
        Employee1 employee1 =
                employees.stream().sorted(Comparator.comparingDouble(Employee1::getSalary)).skip(1).findFirst().get();

        System.out.println(employee1);
    }
}
