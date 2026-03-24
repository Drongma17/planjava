package codingcrack.chatgpt;

import java.util.List;
import java.util.concurrent.*;

public class CompletableFeatureDemo {


     static   ExecutorService executor = Executors.newFixedThreadPool(4);

       public static void testDemo() throws InterruptedException, ExecutionException {
           List<Callable<Integer>> tasks = List.of(
                   ()-> 8,
                   () -> 9,
                   () -> 10
           );
           List<Future<Integer>> fList = executor.invokeAll(tasks);



           int sum =0;
           for(Future<Integer> f: fList){
               sum += f.get();
           }


           executor.shutdown();
           System.out.println("Total = " + sum);
       }







    static void main() throws ExecutionException, InterruptedException {
    CompletableFeatureDemo.testDemo();
    }
}
