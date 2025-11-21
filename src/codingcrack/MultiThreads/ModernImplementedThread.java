package codingcrack.MultiThreads;

public class ModernImplementedThread {

 public static Object SharedObject = new Object();
    public static void main(String[] args) {

        System.out.println("Main Thread started ");


        Runnable objRunnable1 = () -> {
            System.out.println(" Thread 1 is running");
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
            System.out.println(SharedObject.hashCode());
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("Thread 1 completed ");
        };



        Runnable objRunnable2 = () -> {
            System.out.println(" Thread 2 is running");
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
            System.out.println(SharedObject.hashCode());
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("Thread 2 completed ");
        };


        Thread threadObj1 = new Thread(objRunnable1);
        Thread threadObj2 = new Thread(objRunnable2);


        threadObj1.start();

        threadObj2.start();
//        threadObj2.setDaemon(true);
    }
}
