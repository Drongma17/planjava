package gliders;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@FunctionalInterface
 interface NumberComparator {

    boolean comparNumber(int x, int y);

}

public class NumberComparatorMain {

    public static void main(String[] args) {


        NumberComparator c = (a, b) ->{
            if(a > b){
                return true;
            }
                return false;
        };

      //  System.out.println( c.comparNumber(15, 10));

List<Integer> listInt = Arrays.asList(1,2,3,4,4,5,6,6,7,7,7,8,8,8);

        Map<Integer, Long> collect =  listInt.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Set<Map.Entry<Integer, Long>> entries = collect.entrySet();

        for(Map.Entry<Integer, Long> entry : entries){
            System.out.println(entry.getKey() + " ==== " + entry.getValue());
        }

        List<String> javaVersions = Arrays.asList("java 6", "java 7", "java 8");
        boolean flag = javaVersions.stream().allMatch(str->{
            System.out.println("Testing : " + str);
            return str.contains("8");
        });
        System.out.println(flag);

    }
}


