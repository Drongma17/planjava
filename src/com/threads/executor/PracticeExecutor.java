package com.threads.executor;

import java.util.concurrent.*;

public class PracticeExecutor {


    public static void main(String[] args) throws Exception {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        Runnable task = ()-> System.out.println("schedular executor");
        ScheduledFuture<?> future = executor.schedule(task, 2, TimeUnit.SECONDS);

        try{
            future.get();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
