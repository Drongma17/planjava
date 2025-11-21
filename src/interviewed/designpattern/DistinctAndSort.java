package interviewed.designpattern;

import java.util.ArrayList;
import java.util.List;

public class DistinctAndSort {


    public static void main(String[] args) {

       List<Integer> arrayList = new ArrayList<>(List.of(0,1,1,2,3));

        List<Integer> list = arrayList.stream().distinct().sorted().toList();
        System.out.println(list);
    }
}
