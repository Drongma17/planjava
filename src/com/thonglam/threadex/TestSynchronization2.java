package com.thonglam.threadex;

class Tablex{  
 synchronized void printTable(int n){//synchronized method  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  
  
class MyThreadx extends Thread{  
Tablex t;
MyThreadx(Tablex t){
this.t=t;  
}  
public void run(){  
t.printTable(5);  
}  
  
}  
class MyThready extends Thread{  
Tablex t;
MyThready(Tablex t){
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  
  
public class TestSynchronization2{

public static void main(String args[]){  
Tablex obj = new Tablex();//only one object  
MyThreadx t1=new MyThreadx(obj);  
MyThready t2=new MyThready(obj);  
t1.start();  
t2.start();  
}  
}  