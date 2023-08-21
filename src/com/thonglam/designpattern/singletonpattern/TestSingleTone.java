package com.thonglam.designpattern.singletonpattern;

public class TestSingleTone {

    private static TestSingleTone testSingleTone;
    private TestSingleTone(){}


    public static TestSingleTone getTestSingleTone(){
        if(testSingleTone == null){
            testSingleTone = new TestSingleTone();
        }
        return testSingleTone;
    }


    public static void main(String[] args) {
        TestSingleTone ts=new TestSingleTone();
          ts.getTestSingleTone();
    }
}
