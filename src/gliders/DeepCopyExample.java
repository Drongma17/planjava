package gliders;

public class DeepCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address originalAddress = new Address("New York", "5th Avenue");
        Person original = new Person("John", 25, originalAddress);
        
        // Create deep copy
        Person deepCopy = (Person) original.clone();
        
        // Modify the nested object through copy
        deepCopy.address.city = "Los Angeles";
        
        System.out.println("Original city: " + original.address.city);
        System.out.println("Deep copy city: " + deepCopy.address.city);
        // Original remains "New York", copy becomes "Los Angeles"
    }
}