package qualityassurance;

import java.util.concurrent.*;

public class CompletableFutureExample {


    public static void testFirst(){
        CompletableFuture.supplyAsync(()->{
            return "Hello Tibetan";
        }).thenApply(res->res + " youth").thenAccept(System.out::println);
    }


    public static void main(String[] args) {
        testFirst();
        CompletableFuture.supplyAsync(() -> {
            return "Hello";
        }).thenApply(result -> result + " World")
          .thenAccept(System.out::println); // Output: Hello World

        // Pause main to see output
        try { Thread.sleep(500); } catch (Exception e) {}
    }
}