package com.thonglam.threadex;

public class TestThreadx  extends Thread{

    String name;
    String thread ;
    TestThreadx(String name, String thread){
        this.name = name;
        this.thread = thread;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("Thread "+i+" is running here  hi "+name);
        }
    }

    public static void main(String[] args) {
        TestThreadx testThreadx = new TestThreadx("Dawa", "Threads");
        testThreadx.start();
    }
}
