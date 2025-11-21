package qualityassurance;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<String> future = executor.submit(() -> {
            Thread.sleep(1000);
            return "Hello";
        });
        System.out.println(future.get()); // blocks until result is ready

    }
}
