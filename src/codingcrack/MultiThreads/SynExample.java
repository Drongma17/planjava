package codingcrack.MultiThreads;


class Counter {

    int count = 0;

    public synchronized void increment() {
        count++;
    }


    public int getCount() {
        return count;
    }
}

public class SynExample {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable task = () -> {
            for (int i = 0; i <= 10; i++) {
                counter.increment();
                System.out.println(counter.getCount());
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println("Final count (with sync): " + counter.getCount());
    }
}
