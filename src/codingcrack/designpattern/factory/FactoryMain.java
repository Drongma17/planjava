package codingcrack.designpattern.factory;

public class FactoryMain {


    public static void main(String[] args) {
        Vehicle car = FactorySwitch.VehicleFactory("Car");
        car.wheel();

        Vehicle jeep = FactorySwitch.VehicleFactory("Jeep");
        jeep.wheel();

        Vehicle bus = FactorySwitch.VehicleFactory("Bus");
        bus.wheel();

    }
}
