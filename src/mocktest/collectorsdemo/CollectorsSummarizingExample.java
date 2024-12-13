package mocktest.collectorsdemo;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsSummarizingExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        IntSummaryStatistics stats = numbers.stream()
                                            .collect(Collectors.summarizingInt(num -> num));

        System.out.println(stats);
        // Output: IntSummaryStatistics{count=5, sum=15, min=1, average=3.000000, max=5}
    }
}