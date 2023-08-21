package com.thonglam.javatechie.stream.sort;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortListDemo {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(13);
        list.add(20);
        list.add(15);
        list.add(18);


        Collections.sort(list);
//        Collections.reverse(list);
//        System.out.println(list);


        list.stream().filter(i->i>13).sorted(Collections.reverseOrder()).forEach(s-> System.out.print(s+" "));
//        System.out.println();
//        list.stream().sorted(Collections.reverseOrder()).forEach(s-> System.out.print(s+" "));

        System.out.println();

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println(tomorrow);

       LocalTime cl= LocalTime.now();
        System.out.println(cl);


    }
}
