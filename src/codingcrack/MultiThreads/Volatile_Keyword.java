package codingcrack.MultiThreads;

public class Volatile_Keyword {

    public static void main(String[] args) throws Exception {


        SharedResource sharedResource = new SharedResource();

        // Thread 1
        new Thread(() ->{
            System.out.println("Thread 1 Started ");
            try {
                System.out.println("Thread 1 logic Started ");
                Thread.sleep(1000);
                System.out.println("Thread 1 logic completed ");
                sharedResource.setFlag(true);
                System.out.println("Flag set by Thread 1");
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }).start();



        new Thread(() -> {
            System.out.println("Thread 2 started ");
            while(!sharedResource.isFlag()){
           // It will run until flag value is true
            }
            System.out.println("Thread 2 value completed ");
        }).start();

    }
}