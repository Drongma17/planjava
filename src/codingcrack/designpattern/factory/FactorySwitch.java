package codingcrack.designpattern.factory;

public class FactorySwitch {


   public static Vehicle VehicleFactory(String name){

        switch (name){
            case "Car" :
                return new Car();
            case "Jeep":
                return new Jeep();
            case "Bus":
                return new Bus();
            default:
               throw new IllegalArgumentException("your vehicle is not found ") ;
        }
    }

}
