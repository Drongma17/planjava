package codingcrack.executorframework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> {
            System.out.println("Calculating sum in " + Thread.currentThread().getName());
            Thread.sleep(1000);
            return 42; // Result
        };

        Future<Integer> result = executor.submit(task);

        System.out.println("Doing other work...");

        // Get the result (blocks if not ready yet)
        System.out.println("Result: " + result.get());

        executor.shutdown();



            System.out.println("start execute Callable " );
            Callable<?> task1 =()-> {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName()+i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                return "done";
            };
        executor.submit(task1);
        executor.shutdown();

    }
}