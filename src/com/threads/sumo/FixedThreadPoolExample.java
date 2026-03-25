package com.threads.sumo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);


        for(int i=0; i<=3; i++){
            executor.submit(()->{
                String newThred = new Thread().getName();
                System.out.println("Thread Name "+ newThred );
                try {
                    Thread.sleep(200);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            });
        }

        executor.shutdown();
    }
}
