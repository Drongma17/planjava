package com.thonglam.javatechie.brainstorm;
class Pen{
      void write(String msg){
         System.out.println(msg);
    }
}

public class TestMyThread implements Runnable {

    String message ;
    Pen pen;

    public TestMyThread(String message, Pen pen) {
        this.message = message;
        this.pen = pen;
    }

    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            synchronized (pen) {
                pen.write(message);
            }
        }
    }


    public static void main(String[] args) {
        Pen pen=new Pen();
        Thread thread = new Thread(new TestMyThread("hello", pen));
        Thread thread1 = new Thread(new TestMyThread("See", pen));
        Thread thread2 = new Thread(new TestMyThread("my friend", pen));
        thread.start();
        thread1.start();
        thread2.start();
//        try {
//            thread.join();
//            thread1.join();
//            thread2.join();
//        }catch (Exception e){
//            e.printStackTrace();
//        }

    }
}
