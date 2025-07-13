package codingcrack.youtube;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadExample {

    private static Random random = new Random();
    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            synchronized (ThreadExample.class){
                list.add(random.nextInt());
            }
        });


        Thread t2 = new Thread(()->{
            synchronized (ThreadExample.class){
                System.out.println("Reading the list : "+ list);
            }
        });


        t1.start();
        t2.start();
    }
}
