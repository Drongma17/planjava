package com.interview.javatechie.collections;

import java.util.HashSet;
import java.util.Set;

public class DublicateAvoid {
    public static void main(String[] args) {

        Set<Student> set = new HashSet<>();

        Student s1 = new Student(1, "Ngawang");
        Student s2 = new Student(1, "Ngawang");
        Student s3 = new Student(1, "yeshi");
        Student s4 = new Student(1, "Pema");
        Student s5 = new Student(1, "Tashi");
        Student s6 = new Student(3, "Dolma");
        Student s7 = new Student(3, "Sonam");
        Student s8 = new Student(4, "Dawa");

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);
        set.add(s7);
        set.add(s8);

        System.out.println(set.size());
        System.out.println(set);
    }
}
