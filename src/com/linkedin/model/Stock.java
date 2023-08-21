package com.linkedin.model;

public class Stock {
    private final String name;
    private final double value;

    public double getValue() {
        return value;
    }

    public Stock(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
