package codingcrack.MultiThreads;

public class MainThread {


    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread threadMy = new Thread(myThread);

        YourThread yourThread = new YourThread();
        Thread threadYour = new Thread(yourThread);


        threadMy.start();

        threadYour.start();

        threadMy.join();
        threadYour.join();
    }
}
