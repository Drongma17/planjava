package codingcrack.MultiThreads.producerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {

    public static void main(String[] args) {

        // creating blocking queue with capacity of 5
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);



        // creating consumer producer thread
        ProducerBlockingQueue producer = new ProducerBlockingQueue(queue);
        ConsumerBlockingQueue consumer = new ConsumerBlockingQueue(queue);


        // starting comsumer and producer thread
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
