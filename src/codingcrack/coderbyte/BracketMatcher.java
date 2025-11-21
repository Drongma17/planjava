package codingcrack.coderbyte;

import java.util.*;


/**
 *  Bracket Matcher Challenge
 *
 * Challenge:
 * Have the function BracketMatcher(str) take the str parameter being passed and return 1 if the brackets are correctly matched and each one is accounted for. Otherwise, return 0.
 *
 * For example:
 * 	•	If str is "(hello (world))", then the output should be 1 because the brackets are correctly matched.
 * 	•	If str is "((hello (world))", then the output should be 0 because the brackets do not correctly match.
 *
 * Only ( and ) will be used as brackets. If str contains no brackets, return 1.
 */


public class BracketMatcher {

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If closing bracket, check matching
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // no matching opening bracket
                }
                char top = stack.pop();
                if (!matches(top, ch)) {
                    return false; // mismatch
                }
            }
        }
        // Balanced if no leftover opening brackets
        return stack.isEmpty();
    }

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String test1 = "{[()]}";   // Balanced
        String test2 = "{[(])}";   // Not Balanced
        String test3 = "((()))";   // Balanced
        String test4 = "(()";      // Not Balanced

        System.out.println(test1 + " -> " + isBalanced(test1));
        System.out.println(test2 + " -> " + isBalanced(test2));
        System.out.println(test3 + " -> " + isBalanced(test3));
        System.out.println(test4 + " -> " + isBalanced(test4));
    }
}