package com.thonglam.testfolder;
class Moon{
    void m1(int a){
        System.out.println("i am from moon  " + a);
    }
}
public class TestOne extends Moon{

    @Override
    void m1(int a){
        System.out.println("i am from test   "+ a);
    }

    public static void main(String[] args) {
        int b =8;
        for(int a=1; a<=9^b>2; a++)
            if(!(b==4))
                System.out.println(b);

    }
}
