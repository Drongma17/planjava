package com.thonglam.streamex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamss {
    public static void main(String[] args) throws IOException {
        // 1. Integer Stream
//		IntStream.range(1, 10).forEach(System.out::println);
//		System.out.println();
        // 2. Integer Stream with skip
//		IntStream.range(1, 10)
//				.skip(4)
//				.forEach(System.out::println);
        // 3. Integer Stream with sum
//         IntStream.range(1, 11)
//				 .sum();

        // 4. Stream.of, sorted and findFirst
        Stream.of("Ngawang", "Rakesh", "Pema")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println();

        // 5. Stream from Array, sort, filter and print
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
        Arrays.asList(names)
                .stream()
                .filter(n -> n.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

        // 6. average of squares of an int array
        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);
        // 7. Stream from List, filter and print
        Path path = Paths.get("bands.txt");
        try (Stream<String> bands = Files.lines(path)) {
            bands
                    .sorted()
                    .filter(x -> x.length() > 13)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 8. Stream rows from text file, sort, filter, and print


        // 9. Stream rows from text file and save to List


        // 10. Stream rows from CSV file and count


        // 11. Stream rows from CSV file, parse data from rows


        // 12. Stream rows from CSV file, store fields in HashMap


        // 13. Reduction - sum

        // 14. Reduction - summary statistics

    }
}