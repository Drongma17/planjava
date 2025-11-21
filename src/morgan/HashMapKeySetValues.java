package morgan;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class HashMapKeySetValues {

        public static void main(String[] args) {
            Map<Integer, String> myMap = new HashMap<>();
            myMap.put(1, "apple");
            myMap.put(2, "banana");
            myMap.put(3, "orange");

            Stream<Integer> keysStream = myMap.keySet().stream();
            Stream<String> valuesStream = myMap.values().stream();

            for(Integer i : myMap.keySet()){
                System.out.println("key  "+ i + " = "+myMap.get(i));
            }

            // Use the streams
            keysStream.forEach(System.out::println);
            valuesStream.forEach(System.out::println);
        }
    }

