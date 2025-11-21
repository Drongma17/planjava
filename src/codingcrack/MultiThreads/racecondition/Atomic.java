package codingcrack.MultiThreads.racecondition;

public class Atomic {
    public static void main(String[] args) throws InterruptedException {

        AtomicIntegerSharedCounter sharedCounter = new AtomicIntegerSharedCounter();

        // Thread 1
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 started ");
            for (int i = 0; i < 50000; i++) {
                sharedCounter.increment();
            }
            System.out.println("Thread 1 completed ");
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 started ");
            for (int i = 0; i < 50000; i++) {
                sharedCounter.increment();
            }
            System.out.println("Thread 2 completed ");
        });

        t1.start();
        t2.start();

        // wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("total count is : " + sharedCounter.getCount());
    }
}
