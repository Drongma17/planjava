package com.chatgpt.equalandhashcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {
    private String id;
    private String name;
    private int grade;
    
    public Student(String id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Student student = (Student) obj;
        return grade == student.grade &&
               Objects.equals(id, student.id) &&
               Objects.equals(name, student.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, name, grade);
    }
    
    // Usage
    public static void main(String[] args) {
        Student s1 = new Student("S001", "Alice", 85);
        Student s2 = new Student("S001", "Alice", 85);
        Student s3 = new Student("S002", "Bob", 90);
        
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // false
        
        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s2 hashCode: " + s2.hashCode());
        System.out.println("s3 hashCode: " + s3.hashCode());
        
        // Works correctly in HashMap
        Map<Student, String> courses = new HashMap<>();
        courses.put(s1, "Math");
        System.out.println("Course for s2: " + courses.get(s2)); // "Math"
    }
}