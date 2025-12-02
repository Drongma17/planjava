package com.chatgpt.equalandhashcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Person {


    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    static void main() {
        Person p1 = new Person("John", 25);
        Person p2 = new Person("John", 25);

        System.out.println(p1.equals(p2)); // true (if equals overridden)
        System.out.println(p1.hashCode() == p2.hashCode()); // false (if hashCode not overridden)

// Problem in HashMap:
        Map<Person, String> map = new HashMap<>();
        map.put(p1, "Value1");
        System.out.println(map.get(p2)); // null! Even though objects are equal
    }
}

