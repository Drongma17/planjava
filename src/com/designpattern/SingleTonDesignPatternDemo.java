package com.designpattern;

public class SingleTonDesignPatternDemo {

   private static SingleTonDesignPatternDemo singleTonDesignPatternDemo;

    private SingleTonDesignPatternDemo() {
    }


   public static SingleTonDesignPatternDemo singleton(){
        if(singleTonDesignPatternDemo == null)
            return new SingleTonDesignPatternDemo();
        return singleTonDesignPatternDemo;
    }

    public static void main(String[] args) {
        SingleTonDesignPatternDemo.singleton();
    }
}
