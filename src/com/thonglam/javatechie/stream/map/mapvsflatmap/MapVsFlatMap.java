package com.thonglam.javatechie.stream.map.mapvsflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {

        List<Customer> customers = EkartDataBase.getAll();

        // List<Customer> convert List<String> - > Data Transformation
        // mapping : customer -> customer.getEmail()
        // customer - > customer.getEmail()  one to one mapping
        List<String> emails = customers.stream()
                .map(customer -> customer.getEmail())
                .collect(Collectors.toList());
        System.out.println(emails);

        // customer - > customer.getPhoneNumber()  one to one mapping
        List<List<String>> phoneNumbers = customers.stream()
                .map(customer -> customer.getPhoneNumber())
                .collect(Collectors.toList());
        System.out.println(phoneNumbers);


        // List<Customer> convert List<String> - > Data Transformation
        // mapping : customer -> Phone Numbers
        // customer - > customer.getPhoneNumber()  one to many mapping
        List<String> phones = customers.stream()
                .flatMap(customer -> customer.getPhoneNumber()
                        .stream()).collect(Collectors.toList());
        System.out.println(phones);

    }
}
