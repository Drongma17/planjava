package codingcrack.MultiThreads.producerconsumer;

import java.util.List;

public class Producer implements Runnable{


    private List<Integer>  buffer;
    int maxSize ;

    public Producer(List<Integer> buffer, int maxSize) {
        this.buffer = buffer;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
     while (true){
         try {
             producer(maxSize);
         }catch (InterruptedException e){
             Thread.currentThread().interrupt();
         }
     }
    }

    private void producer(int item) throws InterruptedException {

        synchronized (buffer){
            while (buffer.size() == maxSize){
                System.out.println("Buffer is full, waiting for consumer to consume ... ");
                buffer.wait();
            }
            buffer.add(item);
            System.out.println("Produce : "+ item);
            buffer.notifyAll();
        }


    }
}
