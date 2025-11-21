package codingcrack.java.HashMapTableConcurrent;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {


    public static void main(String[] args) {

        Map<String, Integer> ageOfPerson = new HashMap<>();

        ageOfPerson.put("Ngawang", 43);
        ageOfPerson.put("Kunsang", 5);
        ageOfPerson.put("Ngawang", 40);
        ageOfPerson.put("HH",  90);


     //   ageOfPerson.entrySet().stream().map((k)->k.getKey()+"  = "+ k.getValue()).forEach(System.out::println);

        ageOfPerson.forEach((name, age)-> System.out.println("name is "+ name + " and age is "+ age ));
    }
}
