package codingcrack.designpattern.factory;

public class Car implements Vehicle{
    @Override
    public void wheel() {
        System.out.println("I am car vehicle ");
    }
}
