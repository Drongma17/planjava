package codingcrack.MultiThreads.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class ConsumerBlockingQueue implements Runnable {

    private BlockingQueue<Integer>  queue;

    public ConsumerBlockingQueue(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
         while(true){
             Integer item = queue.take();
             System.out.println("Consumed : "+ item);
             Thread.sleep(2000);
         }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
