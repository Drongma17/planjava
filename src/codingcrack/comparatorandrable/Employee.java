package codingcrack.comparatorandrable;

public class Employee implements Comparable<Employee>{



    private int Id;
    private String name;
    private String department;
    private Long salary;

    public Employee(int id, String name, String department, Long salary) {
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

    public Long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
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

    @Override
    public int compareTo(Employee o) {
        return Long.compare(this.getSalary(), o.getSalary());
    }
}
