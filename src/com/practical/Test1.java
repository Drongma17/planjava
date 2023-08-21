package com.practical;

import com.interview.java8code.mapvsflatmap.Customer;

import java.util.List;
import java.util.stream.Collectors;

public class Test1 {


    public static void main(String[] args) {
        List<Customer> ekartDataBase = EkartDataBase.getAll();
        List<String> emails = ekartDataBase.stream().map(Customer::getEmail).collect(Collectors.toList());
        System.out.println(emails);

        List<List<String>> phoneNo = ekartDataBase.stream().map(phone -> phone.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phoneNo);


        List<String> phos = ekartDataBase.stream().flatMap(phoneN -> phoneN.getPhoneNumbers().stream()).collect(Collectors.toList());

        System.out.println(phos);
    }
}
