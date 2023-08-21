package com.thonglam.hashandequal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exec {

    public static void main(String[] args) {
        Student s= new Student("H234");
        Student s1= new Student("H234");
        Student s2= new Student("H234");

        System.out.println(s.equals(s1));


        Map<Student, ReportCard> studentReport =new HashMap<Student, ReportCard>();

        studentReport.put(s, new ReportCard());
        studentReport.put(s1, new ReportCard());
        studentReport.put(s2, new ReportCard());

        System.out.println(studentReport.size());


        Set<Student> studentSet = new HashSet<Student>();
        for(int i=0; i<100; i++){
            studentSet.add(new Student("H"+i));
        }

        System.out.println(studentSet.size());

        long startTime = System.nanoTime();
        System.out.println(studentSet.contains(new Student("H4")));
        System.out.println("Elapsed Time : " + (System.nanoTime() - startTime));

        Student s4 = new Student("H234");
        System.out.println(s.equals(s1));
        System.out.println(s.equals(s2)+ "  --- "+ s2.equals(s));
        System.out.println(s.equals(s2) + " --- "+s2.equals(s4)+ " --- "+ s.equals(s4));
        System.out.println(s.equals(null));
    }
}
