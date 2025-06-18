package S3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapToArrayListKeyValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 35);

        ArrayList<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}