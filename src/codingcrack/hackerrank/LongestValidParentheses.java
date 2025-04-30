package codingcrack.hackerrank;

import java.util.Stack;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
       int maxlenght = 0;
       Stack<Integer> stack = new Stack<>();
       stack.push(-1);
       for(int i=0; i<s.length(); i++){
           char c = s.charAt(i);
           if(c == '('){
               stack.push(i);
           }else {
               stack.pop();

               if(stack.empty()){
                   stack.push(i);
               }else {
                   maxlenght = Math.max(maxlenght, i-stack.peek());
               }
           }
       }
       return maxlenght;
    }

    public static void main(String[] args) {
        String s = "(()())";
        System.out.println("Longest Valid Parentheses Length: " + longestValidParentheses(s)); // Output: 6

        String s2 = ")()())";
        System.out.println("Longest Valid Parentheses Length: " + longestValidParentheses(s2)); // Output: 4
    }
}