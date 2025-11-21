package codingcrack.MultiThreads.executorExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {


    public static void main(String[] args) {

        // Single Thread Executor
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        System.out.println("Single Thread executor");
        for(int i=0; i<=5; i++){
            final int taskId = i;
            singleThreadExecutor.execute(()->{
                System.out.println("Single Thread Task " + taskId + "executed by thread :" + Thread.currentThread().getName());
            });
        }
        singleThreadExecutor.shutdown();


        // Fixed Thread Executor
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        System.out.println("Fixed Thread executor");
        for(int i=0; i<=5; i++){
            final int taskId = i;
            fixedThreadPool.execute(()->{
                System.out.println("Fixed Thread Task " + taskId + "executed by thread :" + Thread.currentThread().getName());
            });
        }
        fixedThreadPool.shutdown();


        // Cached Thread Executor
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        System.out.println("Cached Thread executor");
        for(int i=0; i<=5; i++){
            final int taskId = i;
            cachedThreadPool.execute(()->{
                System.out.println("Cached Thread Task " + taskId + "executed by thread :" + Thread.currentThread().getName());
            });
        }
        cachedThreadPool.shutdown();



        // Scheduled Thread Executor
        ExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(2);
        System.out.println("Scheduled Thread executor");
        for(int i=0; i<=5; i++){
            final int taskId = i;
            scheduledThreadPool.execute(()->{
                System.out.println("Scheduled Thread Task " + taskId + "executed by thread :" + Thread.currentThread().getName());
            });
        }
        scheduledThreadPool.shutdown();

    }
}
