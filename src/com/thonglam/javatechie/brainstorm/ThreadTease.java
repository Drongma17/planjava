package com.thonglam.javatechie.brainstorm;

class Sender{

//    public void send(String msg){
//        for (int i=0; i<5; i++){
//            System.out.println("this is message "+i + "  "+ msg);
//        }
//    }



    public synchronized void send(String msg)
    {
        System.out.println("Sending\t" + msg );
        try
        {
            for(int i=0; i<5; i++) {
                Thread.sleep(1000);
                System.out.println(" count number " +i);
            }
        }
        catch (Exception e)
        {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}


public class ThreadTease extends Thread{

  private String msg;
  Sender sender;

    public ThreadTease(String msg, Sender sender) {
        this.msg = msg;
        this.sender = sender;
    }

//    public void run(){
//        synchronized (sender){
//            sender.send(msg);
//        }
//    }

    public void run(){
            sender.send(msg);
    }
}


class MainClass{
    public static void main(String[] args) {

        Sender send = new Sender();
        ThreadTease thread=new ThreadTease("hi",send );
        ThreadTease thread1=new ThreadTease("bye",send );

        thread.start();
        thread1.start();
    }
}

