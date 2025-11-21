package codingcrack.designpattern.builder;

public class BuilderDesign {


    public static void main(String[] args) {

        Employee employee = new Employee(1, "Yeshi", "US");
        EmployeeBuilder employeeBuilder = new EmployeeBuilder(employee.getId(), employee.getName(), employee.getAddress());

        String address = employeeBuilder.getAddress();
        System.out.println(address);

    }
}
