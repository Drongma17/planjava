package codingcrack.chatgpt;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> task = () -> {
            Thread.sleep(1000); // Simulate long task
            return "Result from Callable";
        };

        Future<String> future = executor.submit(task);

        System.out.println("Doing something else...");
        String result = future.get(); // blocks until result is ready
        System.out.println("Callable Result: " + result);

        executor.shutdown();
    }
}