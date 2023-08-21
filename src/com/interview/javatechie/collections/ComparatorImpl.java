package com.interview.javatechie.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorImpl {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student(1, "Ngawang");
        Student s9 = new Student(1, "Yeshi");
        Student s10 = new Student(1, "Drongma");
        Student s3 = new Student(2, "yeshi");
        Student s4 = new Student(3, "Pema");
        Student s5 = new Student(4, "Tashi");
        Student s6 = new Student(5, "Dolma");
        Student s7 = new Student(6, "Sonam");
        Student s8 = new Student(7, "Dawa");

        students.add(s1);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);

        Collections.sort(students, new IdComparator());

        System.out.println(students);

    }
}
