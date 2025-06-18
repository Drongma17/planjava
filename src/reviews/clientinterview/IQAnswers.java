package reviews.clientinterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IQAnswers {

    public static void main(String[] args) {

        String str = "welcome to code decode and code decode welcome you";
        List<String> list = Arrays.asList(str.split(" "));

      Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
     //   System.out.println(map);
//        Function<String, String> fn = Function.identity();
//        System.out.println(fn.apply("hi"));

        Map<String, Long> collect = Arrays.asList(str.split(" ")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }
}
