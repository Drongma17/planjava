package com.interview.linkdin.stackDemo;

import java.util.Stack;

public class matchingParenthsis {

    public static boolean hasMatchingParentheses(String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char current = s.charAt(i);
            if(current == '('){
                stack.push(current);
            } else if (current == ')') {
                if(!stack.isEmpty()){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    public static boolean hasMatchingParentheseswithoutStack(String s){
        int matchingsymboltracker = 0;

        for(int i=0; i<s.length(); i++){
            char current = s.charAt(i);
            if(current == '('){
                matchingsymboltracker ++;
            } else if (current == ')') {
                if(matchingsymboltracker > 0){
                    matchingsymboltracker --;
                }else {
                    return false;
                }
            }
        }
        return matchingsymboltracker ==0;
    }

    public static void main(String[] args) {
        System.out.println(hasMatchingParentheses("()algorithim()"));
        System.out.println(hasMatchingParentheses("()algorithim(())"));
        System.out.println(hasMatchingParentheses("()(algorithim())"));
        System.out.println(hasMatchingParentheses("()algorithim())"));
        System.out.println(hasMatchingParentheses("()algorithim()("));
        System.out.println(hasMatchingParentheses("()algorithim()))"));
    }
}
