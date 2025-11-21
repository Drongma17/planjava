package codingcrack.MultiThreads.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class ProducerBlockingQueue implements Runnable {

    private BlockingQueue<Integer> queue;

    public ProducerBlockingQueue(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(1000);
                queue.put(i);
                System.out.println("Producer : " + i);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
