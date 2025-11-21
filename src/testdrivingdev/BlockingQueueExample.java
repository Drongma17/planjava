package testdrivingdev;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5); // capacity of 5

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Producing: " + i);
                    queue.put(i); // blocks if queue is full
                    Thread.sleep(500); // simulate delay
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    int item = queue.take(); // blocks if queue is empty
                    System.out.println("Consuming: " + item);
                    Thread.sleep(1000); // simulate processing time
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
