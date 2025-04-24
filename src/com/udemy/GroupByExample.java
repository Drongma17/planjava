package com.udemy;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", "New York", 25),
                new Person("Jane", "Chicago", 30),
                new Person("Mike", "New York", 35),
                new Person("Emily", "Chicago", 22),
                new Person("Sam", "Boston", 28)
        );

        // Group by City
        Map<String, List<Person>> peopleByCity = people.stream()
                .collect(Collectors.groupingBy(Person::getCity));
        System.out.println();
        System.out.println(peopleByCity);
        System.out.println();
        // Print the result
        peopleByCity.forEach((city, personList) -> {
            System.out.println(city + ": " + personList);
        });
    }
}