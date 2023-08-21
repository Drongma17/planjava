package com.thonglam.javatechie.brainstorm;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

   public static List<Student> getStudentData(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Yeshi", 500.0, "D"));
        students.add(new Student(2, "Dawa", 300.0, "A"));
        students.add(new Student(3, "Sonam", 100.0, "B"));
        students.add(new Student(4, "Tashi", 200.0, "C"));
        students.add(new Student(5, "Dolma", 300.0, "D"));
        students.add(new Student(6, "Dorjee", 600.0, "E"));
        students.add(new Student(7, "Pasang", 200.0, "C"));
        students.add(new Student(8, "Ngodup", 400.0, "D"));
        students.add(new Student(9, "Norbu", 700.0, "F"));
        students.add(new Student(10, "Gonpo", 500.0, "B"));

        return students;
    }
}
