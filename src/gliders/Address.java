package gliders;

class Address implements Cloneable {
    String city;
    String street;
    
    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable {
    String name;
    int age;
    Address address;
    
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    // Deep copy implementation
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = (Address) this.address.clone();  // Copy nested object
        return cloned;
    }
}