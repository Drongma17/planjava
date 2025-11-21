package codingcrack.executorframework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutor {



    public static void main(String[] args) {

        Callable<String> task = () ->{
            try {
                Thread.sleep(1000);
                return "Hello This is callable ";
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

      ExecutorService executor = Executors.newFixedThreadPool(3);

      executor.submit(task);
    }


}
