package com.thonglam.javatechie.brainstorm;


class MyStudent {
    public static String message = null;
    public void tution(){
        System.out.println("i am attending tution for java");
    }
}

class HelpingTution extends Thread{

    public void run(){
        for(int i=0; i<10; i++){
            try {
                Thread.sleep(1000);
                
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExecutions {

    public static void main(String[] args) {

    }
}
