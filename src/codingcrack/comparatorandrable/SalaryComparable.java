package codingcrack.comparatorandrable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalaryComparable  {

    List<Employee> employees = new ArrayList<>();

    List<Employee> getAllEmployee(){
        employees.add(new Employee(1, "Ngawang", "CSE", 9000l));
        employees.add(new Employee(2, "Sonam ", "CSE", 8000l));
        employees.add(new Employee(3, "Dolma", "HR", 5000L));
        employees.add(new Employee(4, "Pema", "IS", 10000l));
        employees.add(new Employee(5, "Dorjee", "Driver", 4000l));
        employees.add(new Employee(6, "Dawa", "IS", 12000l));
        employees.add(new Employee(7, "Samten", "Farmer", 7000l));
        employees.add(new Employee(8, "Norbu", "Teacher", 19000l));
        employees.add(new Employee(9, "Drongma", "Teacher", 15000l));

        return employees;
    };

    public static void main(String[] args) {
        SalaryComparable employeeDao = new SalaryComparable();

        List<Employee> allEmployee = employeeDao.getAllEmployee();
        Collections.sort(allEmployee.reversed());

        allEmployee.forEach(e-> System.out.println(e));
    }
}
