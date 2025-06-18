package S3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockAvoidanceExample {
    private static final Lock lock1 = new ReentrantLock();
    private static final Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            if (lock1.tryLock()) {
                try {
                    System.out.println("Thread 1: Holding lock 1...");
                    try {
                        if (lock2.tryLock(100, TimeUnit.MILLISECONDS)) {
                            try {
                                System.out.println("Thread 1: Holding lock 1 and lock 2...");
                            } finally {
                                lock2.unlock();
                            }
                        } else {
                            System.out.println("Thread 1: Unable to acquire lock 2...");
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    lock1.unlock();
                }
            } else {
                System.out.println("Thread 1: Unable to acquire lock 1...");
            }
        });

        Thread thread2 = new Thread(() -> {
            if (lock2.tryLock()) {
                try {
                    System.out.println("Thread 2: Holding lock 2...");
                    try {
                        if (lock1.tryLock(100, TimeUnit.MILLISECONDS)) {
                            try {
                                System.out.println("Thread 2: Holding lock 1 and lock 2...");
                            } finally {
                                lock1.unlock();
                            }
                        } else {
                            System.out.println("Thread 2: Unable to acquire lock 1...");
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    lock2.unlock();
                }
            } else {
                System.out.println("Thread 2: Unable to acquire lock 2...");
            }
        });

        thread1.start();
        thread2.start();
    }
}