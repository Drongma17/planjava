package codingcrack.MultiThreads;

public class YourThread implements Runnable{

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("YourThread: " + i);
                try {
                    Thread.sleep(700); // Pause for 0.7 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

