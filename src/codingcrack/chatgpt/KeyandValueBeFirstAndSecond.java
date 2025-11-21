package codingcrack.chatgpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KeyandValueBeFirstAndSecond {


    private static Map<Integer, Integer> processInt(List<Integer> list){
        return IntStream.range(0, list.size())
                .boxed()
                .collect(Collectors.toMap(
                        i-> list.get(i),
                        i ->{
                            int current = list.get(i);
                                    int nextNumber = (i < list.size() -1) ? list.get(i + 1) : 0;
                            return current + nextNumber;
                        }
                ));
    }

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(2,4,6,8,10);
        Double collect = list.stream().map(i -> i * 2).collect(Collectors.averagingDouble(Integer::intValue));
        System.out.println(collect);

        Map<Integer, Integer> integerIntegerMap = processInt(list);
        System.out.println(integerIntegerMap.entrySet().toString());


    }
}
