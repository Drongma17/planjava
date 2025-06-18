package qualityassurance;

import java.util.concurrent.*;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            return "Hello";
        }).thenApply(result -> result + " World")
          .thenAccept(System.out::println); // Output: Hello World

        // Pause main to see output
        try { Thread.sleep(500); } catch (Exception e) {}
    }
}