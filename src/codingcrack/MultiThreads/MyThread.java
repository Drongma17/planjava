package codingcrack.MultiThreads;

public class MyThread implements Runnable{

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("MyThread: " + i);
                try {
                    Thread.sleep(500); // Pause for half a second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


