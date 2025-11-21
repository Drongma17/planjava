package gliders;



public class ShallowCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address originalAddress = new Address("New York", "5th Avenue");
        Person original = new Person("John", 25, originalAddress);
        
        // Create shallow copy
        Person shallowCopy = (Person) original.clone();
        
        // Modify the nested object through copy
        shallowCopy.address.city = "Los Angeles";
        
        System.out.println("Original city: " + original.address.city);
        System.out.println("Shallow copy city: " + shallowCopy.address.city);
        // Both print "Los Angeles" - they share the same Address object!
    }
}