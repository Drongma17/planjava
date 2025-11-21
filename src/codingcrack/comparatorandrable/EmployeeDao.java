package codingcrack.comparatorandrable;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {



    List<Employees> employees = new ArrayList<>();

    List<Employees> getAllEmployee(){
        employees.add(new Employees(1, "Ngawang", "CSE", 9000.00));
        employees.add(new Employees(2, "Sonam ", "CSE", 8000.00));
        employees.add(new Employees(3, "Dolma", "HR", 5000.00));
        employees.add(new Employees(4, "Pema", "IS", 10000.00));
        employees.add(new Employees(5, "Dorjee", "Driver", 10000.00));
        employees.add(new Employees(6, "Dawa", "IS", 12000.00));
        employees.add(new Employees(7, "Samten", "Farmer", 7000.00));
        employees.add(new Employees(8, "Norbu", "Teacher", 19000.00));
        employees.add(new Employees(9, "Drongma", "Teacher", 15000.00));

        return employees;
    };
}
