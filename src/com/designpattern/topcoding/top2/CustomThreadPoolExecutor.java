package com.designpattern.topcoding.top2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class CustomThreadPoolExecutor {

    private final BlockingQueue<Runnable> taskQueue;
    private final Worker[] workers;
    private final AtomicBoolean isShutdown = new AtomicBoolean(false);
    private final RejectionHandler rejectionHandler;

    public interface RejectionHandler {
        void reject(Runnable task);
    }

    private class Worker extends Thread {
        public void run() {
            while (!isShutdown.get() || !taskQueue.isEmpty()) {
                try {
                    Runnable task = taskQueue.take();
                    task.run();
                } catch (InterruptedException e) {
                    // Allow thread to exit if interrupted during shutdown
                    if (isShutdown.get()) break;
                }
            }
        }
    }

    public CustomThreadPoolExecutor(int poolSize, int queueSize, RejectionHandler rejectionHandler) {
        this.taskQueue = new LinkedBlockingQueue<>(queueSize);
        this.workers = new Worker[poolSize];
        this.rejectionHandler = rejectionHandler;

        for (int i = 0; i < poolSize; i++) {
            workers[i] = new Worker();
            workers[i].start();
        }
    }

    public void submit(Runnable task) {
        if (isShutdown.get()) {
            throw new IllegalStateException("ThreadPool is shutting down. Cannot accept new tasks.");
        }
        if (!taskQueue.offer(task)) {
            rejectionHandler.reject(task);
        }
    }

    public void shutdown() {
        isShutdown.set(true);
        for (Worker worker : workers) {
            worker.interrupt();
        }
    }
}
