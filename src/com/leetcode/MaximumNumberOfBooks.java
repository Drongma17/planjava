package com.leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaximumNumberOfBooks {

    public long maximumBooks(int[] books) {
        long[] dp = new long[books.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < books.length; i++){
            while(!stack.isEmpty() && books[i] < books[stack.peek()]+i-stack.peek()){
                stack.pop();
            }
            int j = stack.isEmpty()? Math.max(0, i-books[i]+1) : stack.peek()+1;
            dp[i] = 1L*(books[i]+books[i]-(i-j))*(i-j+1)/2 + (stack.isEmpty()? 0 : dp[j-1]);
            stack.push(i);
        }
        return Arrays.stream(dp).max().getAsLong();
    }

    public static void main(String[] args) {
        MaximumNumberOfBooks solution = new MaximumNumberOfBooks();
        int[] books = {8,5,2,7,9};
        System.out.println("max number of books are : " + solution.maximumBooks(books)); // Output: 19
    }
}
