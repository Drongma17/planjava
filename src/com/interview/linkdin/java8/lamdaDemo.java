package com.interview.linkdin.java8;



import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class lamdaDemo {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Kalsang");
        students.add("Dolma");
        students.add("Dawa");
        students.add("Tashi");


       // students.forEach(s -> System.out.println(s));

        // Consumer
        Consumer<String> printItem = n-> System.out.println(n);
        students.forEach(printItem);

        // Functional
        Function<Integer, Integer> doubly = n -> n * n;
        System.out.println(doubly.apply(8));

       // Predicate
        IntPredicate isDivByThree = n -> n % 3 == 0;
        System.out.println(isDivByThree.test(3));

        // Supplier
        Supplier<Double> randomNumUnder100 = () -> Math.random() * 100;
        System.out.println(randomNumUnder100.get());

    }
}
