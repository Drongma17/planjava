package codingcrack.chatgpt;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private final int capacity;

    public LRUCache(int capacity) {
        // accessOrder = true means access-order, not insertion-order
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    // This method is called after every put() to determine if we should remove the eldest
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    // Helper method to display cache content
    public void printCache() {
        System.out.println("Cache: " + super.toString());
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");
        cache.printCache(); // {1=One, 2=Two, 3=Three}

        cache.get(1); // Access 1 to make it recently used
        cache.put(4, "Four"); // Evicts key 2 (least recently used)
        cache.printCache(); // {3=Three, 1=One, 4=Four}
    }
}