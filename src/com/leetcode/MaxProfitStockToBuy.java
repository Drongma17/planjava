package com.leetcode;

/*
Given an array prices where prices[i] is the price of a given stock on day i,
 write a function to find the maximum profit you can achieve from a single buy and sell transaction.
  You must buy the stock before you sell it.
 */

public class MaxProfitStockToBuy {


        public static int maxProfit(int[] prices) {
            int ans = 0;
            int minimumSoFar = prices[0];
            for(int i = 1; i < prices.length; i++) {
                int currentProfit = prices[i] - minimumSoFar;
                if (currentProfit > ans) {
                    ans = currentProfit;
                }
                minimumSoFar = Math.min(minimumSoFar, prices[i]);
                System.out.println("minimum so far : " + minimumSoFar);
            }
            return ans;
        }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("stock profit  :  " + MaxProfitStockToBuy.maxProfit(prices));
    }
    }

