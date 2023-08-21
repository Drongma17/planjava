package com.thonglam.runnableex;

public class SingleThread {

    public static void main(String[] args) {
        Thread th=new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getId() + " value " + i);
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
                th.start();
    }
}
