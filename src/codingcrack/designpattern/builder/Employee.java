package codingcrack.designpattern.builder;

public class Employee {

    private int Id;
    private String name;
    private String address;


    public Employee(int id, String name, String address) {
        Id = id;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
