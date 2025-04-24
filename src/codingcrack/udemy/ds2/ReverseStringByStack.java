package codingcrack.udemy.ds2;

import java.util.Stack;

public class ReverseStringByStack {


    public static String reverseByStack(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            stack.push(c);
        }

        StringBuilder builder = new StringBuilder();
        while (!stack.empty()){
            builder.append(stack.pop());
        }

        return builder.toString();
    }


    public static void main(String[] args) {
        String hello = ReverseStringByStack.reverseByStack("hello world, how are you?");
        System.out.println(hello);
    }
}
