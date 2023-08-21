package mocktest.javatpoint;
interface Staticmethod{
     int mul(int a, int b);
}
interface Sayable{
    int say(int a, int b);
}  
public class InstanceMethodReference {  
    public int saySomething(int a, int b){
        return a + b;
    }
    public static int multiplyTwoNumber(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {  
        InstanceMethodReference methodReference = new InstanceMethodReference(); // Creating object  
        // Referring non-static method using reference  
            Sayable sayable = methodReference::saySomething;

        // Calling interface method  
           int sum = sayable.say(20, 50);
        System.out.println(sum);
            // Referring non-static method using anonymous object  
            Sayable sayable2 = new InstanceMethodReference()::saySomething; // You can use anonymous object also  
            // Calling interface method  
           int sum1= sayable2.say(70, 60);
        System.out.println(sum1);


     // ------------------------------------------------------
        Staticmethod mulresult=InstanceMethodReference::multiplyTwoNumber;
        System.out.println(mulresult.mul(10, 5));
    }

}  