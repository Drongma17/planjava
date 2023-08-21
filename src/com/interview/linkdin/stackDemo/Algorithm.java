package com.interview.linkdin.stackDemo;

import java.util.Stack;

public class Algorithm {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("main");
        stack.push("builder");
        stack.push("external-service");
        System.out.println("END : = "+ stack.pop());
        stack.push("parse-external-data");
        System.out.println("END : = "+ stack.pop());
        System.out.println("END : = "+ stack.pop());
        System.out.println("END : = "+ stack.pop());
    }
}
