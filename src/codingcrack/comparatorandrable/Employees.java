package codingcrack.comparatorandrable;

public class Employees{



    private int Id;
    private String name;
    private String department;
    private Double salary;

    public Employees(int id, String name, String department, Double salary) {
        Id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employees{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

}
