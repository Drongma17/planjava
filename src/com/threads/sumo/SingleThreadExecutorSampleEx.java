package com.threads.sumo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorSampleEx {


    public static void main(String[] args) {


        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.submit(()->

            System.out.println( "Task A = " + Thread.currentThread().getName()));

        executor.submit(()->

                System.out.println( "Task B = " + Thread.currentThread().getName()));


        executor.shutdown();
    }


}
