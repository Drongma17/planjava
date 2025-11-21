package codingcrack.designpattern.factory;

public class Bus implements Vehicle{
    @Override
    public void wheel() {
        System.out.println("I am Bus Vehicle ");
    }
}
