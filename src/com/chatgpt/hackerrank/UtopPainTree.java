package com.chatgpt.hackerrank;

public class UtopPainTree {

   static int calculateHeight(int n){
        int height = 1;
        for(int i=1; i <= n; i++){
            if(i % 2 !=0) {
                height = height * 2;
            }else {
                height = height + 1;
            }
        }
        return height;
    }

    public static void main(String[] args) {
        System.out.println( calculateHeight(4));
    }

}
