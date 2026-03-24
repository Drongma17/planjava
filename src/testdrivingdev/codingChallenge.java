package testdrivingdev;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class codingChallenge {

    static void main() {


        List<Integer> list = Arrays.asList(1,2,4,8,4,6);

        Integer secondLargest = list.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).skip(1).findFirst().get();
        // System.out.println(secondLargest);

        String str ="ganegan";

        Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      //  System.out.println(collect);

        List<String> li = Arrays.asList("aba", "cba", "ete");
        List<String> collectPalindrom = li.stream().filter(x -> x.equals(new StringBuilder(x).reverse().toString())).collect(Collectors.toList());
      //  System.out.println(collectPalindrom);

        List<String> strings = Arrays.asList("abc", "abcd", "abcde");
        strings.stream().reduce((a,b) ->{
            if(a.length() > b.length()) return a;
            else return b;
        }).get();
        System.out.println(strings);

    }
}
