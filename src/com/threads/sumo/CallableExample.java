package com.threads.sumo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableExample {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i <= 5; i++) {
            Callable<Integer> callable = () -> {

                System.out.println("Thread A  " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException inE) {
                    inE.printStackTrace();
                }

                return 100;
            };
        }

    }
}