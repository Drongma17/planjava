package codingcrack.comparatorandrable;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SalaryComparator implements Comparator<Employees> {



    @Override
    public int compare(Employees o1, Employees o2) {
        return o1.getSalary().compareTo(o2.getSalary());
    }


    public static void main(String[] args) {

        EmployeeDao employeeDao = new EmployeeDao();
        List<Employees> allEmployee = employeeDao.getAllEmployee();
        Collections.sort(allEmployee, new SalaryComparator());

//       allEmployee.forEach(e-> System.out.println(e));

        Comparator<Employees> tComparator = Comparator.comparingDouble(Employees::getSalary)
                .thenComparing(Employees::getName);

        allEmployee.sort(tComparator);
        allEmployee.forEach(e-> System.out.println(e));
    }
}
