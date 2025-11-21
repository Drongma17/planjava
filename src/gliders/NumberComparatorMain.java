package gliders;


import java.util.Arrays;
import java.util.List;

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


        List<String> javaVersions = Arrays.asList("java 6", "java 7", "java 8");
        boolean flag = javaVersions.stream().allMatch(str->{
            System.out.println("Testing : " + str);
            return str.contains("8");
        });
        System.out.println(flag);

    }
}


