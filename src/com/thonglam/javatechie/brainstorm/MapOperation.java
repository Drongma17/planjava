package com.thonglam.javatechie.brainstorm;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class MapOperation {

    public static void main(String[] args) {

        List<Student> students =DataBase.getStudentData();
        List<Double> collect = students.stream().map(Student::getPocketMoney).collect(Collectors.toList());
        System.out.println(collect.stream().sorted().collect(Collectors.toList()));
        List<Student> collect1 = students.stream().filter(student -> student.getPocketMoney() > 500).collect(Collectors.toList());

        HashSet hashSet = new HashSet(collect);
        System.out.println(hashSet.stream().sorted().collect(Collectors.toList()));

        List list = new ArrayList(hashSet);
        list.stream().sorted().forEach(System.out::print);

        HashSet hashSet1 =new HashSet(collect1);
        System.out.println(hashSet1.stream().collect(Collectors.toList()));

    }
}
