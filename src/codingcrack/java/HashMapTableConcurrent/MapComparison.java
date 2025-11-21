package codingcrack.java.HashMapTableConcurrent;

import java.util.*;
import java.util.concurrent.*;

public class MapComparison {
    public static void main(String[] args) {
        // 1. HashMap (Not synchronized, allows null key & values)
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        hashMap.put(null, "NullKey");   // Allowed
        hashMap.put("C", null);         // Allowed
        System.out.println("HashMap: " + hashMap);

        // 2. Hashtable (Synchronized, does not allow null key/value)
        Map<String, String> hashtable = new Hashtable<>();
        hashtable.put("A", "Apple");
        hashtable.put("B", "Banana");
        // hashtable.put(null, "NullKey"); // ❌ NullPointerException
        // hashtable.put("C", null);       // ❌ NullPointerException
        System.out.println("Hashtable: " + hashtable);

        // 3. ConcurrentHashMap (Thread-safe, no null keys or values)
        Map<String, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("A", "Apple");
        concurrentMap.put("B", "Banana");
        // concurrentMap.put(null, "NullKey"); // ❌ NullPointerException
        // concurrentMap.put("C", null);       // ❌ NullPointerException
        System.out.println("ConcurrentHashMap: " + concurrentMap);

        // Demonstrating thread-safety difference
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                hashMap.put("Thread-" + i, "Value");  // ❌ Not safe
                concurrentMap.put("Thread-" + i, "Value"); // ✅ Safe
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("HashMap size (not thread-safe): " + hashMap.size());
        System.out.println("ConcurrentHashMap size (thread-safe): " + concurrentMap.size());
    }
}