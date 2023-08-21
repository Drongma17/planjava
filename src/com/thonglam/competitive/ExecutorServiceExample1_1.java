package com.thonglam.competitive;

import java.util.concurrent.*;

public class ExecutorServiceExample1_1 {

    public static void main(String[] args) {


        int corePoolSize = 10;
        int maxPoolSize = 20;
        long keepAliveTime = 300;

        ExecutorService threadPoolExecutorService = new ThreadPoolExecutor(
                corePoolSize,
                maxPoolSize,
                keepAliveTime,
                TimeUnit.MICROSECONDS,
                new ArrayBlockingQueue<>(128)
        );

        threadPoolExecutorService =(ThreadPoolExecutor)
                Executors.newFixedThreadPool(3);

        ExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(corePoolSize);

        scheduledExecutorService = Executors.newScheduledThreadPool(10);
    }


    private static Runnable newRunnable(String msg){

        return new Runnable() {
            @Override
            public void run() {
                String completeMsg = Thread.currentThread().getName() + ":" + msg;
                System.out.println(completeMsg);
            }
        };
    }
}
