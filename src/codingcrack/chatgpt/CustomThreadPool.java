package codingcrack.chatgpt;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CustomThreadPool {

    private final BlockingQueue<Runnable> taskQueue;
    private final WorkerThread[] workers;
    private volatile boolean isStopped = false;

    public CustomThreadPool(int numberOfThreads) {
        taskQueue = new LinkedBlockingQueue<>();
        workers = new WorkerThread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            workers[i] = new WorkerThread("Worker-" + i);
            workers[i].start();
        }
    }

    public void submit(Runnable task) throws InterruptedException {
        if (!isStopped) {
            taskQueue.put(task);
        } else {
            throw new IllegalStateException("ThreadPool is stopped");
        }
    }

    public void shutdown() {
        isStopped = true;
        for (WorkerThread worker : workers) {
            worker.interrupt();
        }
    }

    private class WorkerThread extends Thread {
        public WorkerThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (!isStopped || !taskQueue.isEmpty()) {
                try {
                    Runnable task = taskQueue.take();
                    task.run();
                } catch (InterruptedException ignored) {
                    // Allow thread to exit if shutdown is called
                }
            }
        }
    }

    // Example usage
    public static void main(String[] args) throws InterruptedException {
        CustomThreadPool threadPool = new CustomThreadPool(3);

        for (int i = 1; i <= 10; i++) {
            int taskId = i;
            threadPool.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " is executing task " + taskId);
                try {
                    Thread.sleep(500); // simulate task work
                } catch (InterruptedException ignored) {
                }
            });
        }

        Thread.sleep(3000);
        threadPool.shutdown();
    }
}