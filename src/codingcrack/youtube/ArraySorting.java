package codingcrack.youtube;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySorting {

    public static void main(String[] args) {

        List<Integer> listA = new ArrayList<>();
        listA.add(1);
        listA.add(2);
        listA.add(3);
        listA.add(3);
        listA.add(4);
        listA.add(5);
        listA.add(6);


        Collections.sort(listA);

        for(Integer str : listA){
            System.out.print(str+" ");
        }
        System.out.println();
        System.out.println(Collections.binarySearch(listA, 3));
        System.out.println();
        System.out.println(Collections.frequency(listA, 3));
        System.out.println();
        System.out.println(Collections.max(listA));
        System.out.println();
        System.out.println(Collections.min(listA));
        Collections.swap(listA, 0, 5);
        System.out.println(listA);
    }

}
