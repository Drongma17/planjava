package codingcrack.optionalexample;

import java.util.Optional;

public class OptionalClass {


    public String getUserName(User user) {
        return Optional.ofNullable(user)
                .map(User::getName)
                .orElse("Unknown");
    }



    Optional<User> userOpt = Optional.of(new User("Tom", new Address("NY")));
    String city = userOpt
            .map(User::getAddress)
            .map(Address::getCity)
            .orElse("City not available");


     void testDemo(){

         Optional<String> name = Optional.of("Alice");
         name.ifPresent(n -> System.out.println("Name is: " + n));


         String name1 = Optional.ofNullable(null).orElse("Default Name").toString();
         String name2 = Optional.ofNullable(null).orElseGet(() -> "Generated Name").toString();
         String name3 = Optional.of("Real Name").orElseThrow(() -> new RuntimeException("No value!"));


         Optional<String> opt1 = Optional.of("Hello");
         Optional<String> opt2 = Optional.empty();

         String result = opt1.flatMap(v1 ->
                         opt2.map(v2 -> v1 + " " + v2))
                 .orElse("Fallback Value");

         System.out.println(result); // Output: Fallback Value

     }


    public static void main(String[] args) {

    }

}
