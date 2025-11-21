package com.ididlo;

import java.util.LinkedList;

class SharedBuffer {
    private final LinkedList<Integer> buffer = new LinkedList<>();
    private final int capacity = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait(); // Wait until space is available
        }
        buffer.add(value);
        System.out.println("Produced: " + value);
        notify(); // Notify consumer
    }

    public synchronized void consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); // Wait until something is available
        }
        int value = buffer.removeFirst();
        System.out.println("Consumed: " + value);
        notify(); // Notify producer
    }
}

class Producer extends Thread {
    private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        int value = 0;
        try {
            while (true) {
                buffer.produce(value++);
                Thread.sleep(500); // Simulate production time
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer extends Thread {
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(1000); // Simulate consumption time
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();
        new Producer(buffer).start();
        new Consumer(buffer).start();
    }
}
