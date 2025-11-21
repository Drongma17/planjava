package codingcrack.coderbyte;

public class VolatileExample {
    private static volatile boolean running = true; // shared flag

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            System.out.println("Worker started...");
            while (running) {
                // do some work
            }
            System.out.println("Worker stopped!");
        });

        worker.start();

        Thread.sleep(2000); // Let worker run for 2 seconds
        System.out.println("Main thread is stopping worker...");
        running = false; // change is immediately visible to worker thread
    }
}
