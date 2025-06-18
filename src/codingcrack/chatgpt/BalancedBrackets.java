package codingcrack.chatgpt;

import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            switch (ch) {
                case '(': case '{': case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
                default:
                    // Ignore non-bracket characters
            }
        }

        return stack.isEmpty(); // All brackets should be closed
    }

    public static void main(String[] args) {
        String input1 = "{[()()]}";
        String input2 = "{[(])}";

        System.out.println(input1 + " → " + isBalanced(input1)); // true
        System.out.println(input2 + " → " + isBalanced(input2)); // false
    }
}