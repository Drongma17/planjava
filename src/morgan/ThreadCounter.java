package morgan;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadCounter {

    public static void multiThread(){

    // Shared Counter
    AtomicInteger counter = new AtomicInteger();

    // Thread A
    Thread threadA = new Thread(() -> {
        for (int i = 0; i < 1000; i++) {
            counter.getAndIncrement();
        }
    });

    // Thread B
    Thread threadB = new Thread(() -> {
        for (int i = 0; i < 1000; i++) {
            counter.getAndIncrement();
        }
    });

// Start both threads
threadA.start();
threadB.start();

// Wait for both threads to finish
        try {
            threadA.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            threadB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

// Print the final value of the counter
System.out.println("Counter: " + counter);
}

    public static void main(String[] args) {
        multiThread();
    }
}