package codingcrack.MultiThreads.racecondition;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedCounter {

    private  int count;

//    private static int count;

    public int getCount() {
        return count;
    }

    public synchronized void increment() {
        count ++;
    }



//    public void increment(){
//        System.out.println("No need of locks ");
//        synchronized (this){
//            count++;
//        }
//    }


//
//    public static void increment(){
//        System.out.println("No need of locks ");
//        synchronized (SharedCounter.class){
//            count++;
//        }
//    }

}
