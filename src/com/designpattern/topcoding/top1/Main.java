package com.designpattern.topcoding.top1;

public class Main {
    public static void main(String[] args) {
        LRUCacheOptimized<Integer, String> cache = new LRUCacheOptimized<>(3);
        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        cache.get(1); // Access 1 to move it to recent
        cache.put(4, "D"); // Evicts key 2

        cache.printCache(); // Should show {3=C, 1=A, 4=D}
    }
}
