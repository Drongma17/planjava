package interviewed.designpattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class group0s {


    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(List.of(1,0,0,1,0));

//        System.out.println(
//                arrayList.stream().collect(Collectors.partitioningBy(e->e==0))
//                        .values().stream()
//                        .flatMap(e->e.stream())
//                        .collect(Collectors.toList())
//        );


        Collection<List<Integer>> values = arrayList.stream().collect(Collectors.partitioningBy(e -> e == 0)).values();
        System.out.println(values);

        List<Integer> collect = arrayList.stream().collect(Collectors.partitioningBy(e -> e == 0))
                .values().stream().flatMap(e -> e.stream()).collect(Collectors.toList());
        System.out.println(collect);

    }
}
