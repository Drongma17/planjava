package S3;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapToArrayListValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 35);

        ArrayList<Integer> valueList = new ArrayList<>(map.values());
        System.out.println(valueList); // Output: [25, 30, 35]
    }
}