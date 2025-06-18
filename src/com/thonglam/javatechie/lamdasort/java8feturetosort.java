package com.thonglam.javatechie.lamdasort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;




class Magazine {
    private String title;
    private double price;

    public Magazine(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() { return title; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return title + " - $" + price;
    }
}

public class java8feturetosort {
    public static void main(String[] args) {
        List<Magazine> magazines = Arrays.asList(
                new Magazine("Java Fundamentals", 45.99),
                new Magazine("Effective Java", 38.50),
                new Magazine("Spring Boot in Action", 49.99),
                new Magazine("Microservices Architecture", 42.75)
        );

        // Sort magazines by price in ascending order using Stream API
        List<Magazine> sortedBooks = magazines.stream()
                .sorted(Comparator.comparingDouble(Magazine::getPrice))
                .collect(Collectors.toList());


        List<Magazine> sortMagazine = magazines.stream().sorted(Comparator.comparingDouble(Magazine::getPrice))
                .collect(Collectors.toList());

        // Print sorted book list
        sortedBooks.forEach(System.out::println);
    }
}
