package com.interview.deadlock;

public class DeadLockDemo2 extends Thread {

    private Object object1;
    private Object object2;

    public DeadLockDemo2( Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public void run() {
        synchronized (object2) {

            try {
                System.out.println("Acquire lock for object2 and wait for object1");
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (object1){
                System.out.println("Acquire the lock for object1 and object2");
            }
        }

    }
}