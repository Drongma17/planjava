package S3;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapToArrayListKey {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 35);

        ArrayList<String> keyList = new ArrayList<>(map.keySet());
        System.out.println(keyList); // Output: [John, Alice, Bob]
    }
}