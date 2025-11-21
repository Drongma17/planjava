package codingcrack.MultiThreads.producerconsumer;


import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerExample {

    public static void main(String[] args) {


        List<Integer> buffer = new ArrayList<>();
                int maxSize = 5;

        Producer producer = new Producer(buffer, maxSize);
        Consumer consumer = new Consumer(buffer);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

    }
}
