package codingcrack.youtube;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

public class StreamingImpl {

    record Car(String type, String make, String model, Integer engineCapacity){};


    public static void main(String[] args) {

        List<Car> cars = List.of(
                new Car("sedan", "BMW", "2018", 1998),
                new Car("sedan", "Drong", "WONG", 2000),
                new Car("hatchback", "Yeshi", "LAX", 2300),
                new Car("hatchback", "Honda", "2022", 1990),
                new Car("hatchback", "Toyota", "2023", 2091),
                new Car("hatchback", "Hundai", "1930", 1400),
                new Car("sedan", "Audi", "A5", 2900),
                new Car("sedan", "BMC", "2019", 1987)
        );


        List<Car> dedanCar = cars.stream().filter(car -> car.type.equalsIgnoreCase("sedan")).toList();
      //  System.out.println(dedanCar);

        List<String> list = cars.stream().map(car -> car.make).toList();
      //  System.out.println(list);

        List<String> carMakeModelList = cars.stream().flatMap(car -> List.of(car.make, car.model).stream()).toList();
       // System.out.println(carMakeModelList);

        List<List<String>> carMakeModelList1 = cars.stream().map(car -> List.of(car.make, car.model)).toList();
      //  System.out.println("SEE ME : "+carMakeModelList1);
        
        List<String> carMakeModelListStream = cars.stream().flatMap(car -> Stream.of(car.make, car.model)).toList();
      //  System.out.println(carMakeModelListStream);

        Map<Boolean, List<Car>> sedanCar = cars.stream().collect(Collectors.partitioningBy(car -> car.type.equalsIgnoreCase("sedan")));
       // System.out.println(sedanCar);

        Map<String, Map<String, Integer>> collect = cars.stream().collect(groupingBy(Car::type, toMap(Car::make, Car::engineCapacity)));
        System.out.println(collect);
    }
}
