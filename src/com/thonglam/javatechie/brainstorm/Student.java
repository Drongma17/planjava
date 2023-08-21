package com.thonglam.javatechie.brainstorm;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private double pocketMoney;
    private String section;


    public Student(int id, String name, double pocketMoney, String section) {
        this.id = id;
        this.name = name;
        this.pocketMoney = pocketMoney;
        this.section = section;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPocketMoney() {
        return pocketMoney;
    }

    public void setPocketMoney(double pocketMoney) {
        this.pocketMoney = pocketMoney;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pocketMoney=" + pocketMoney +
                ", section='" + section + '\'' +
                '}';
    }

}
