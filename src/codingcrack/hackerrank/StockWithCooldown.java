package codingcrack.hackerrank;

public class StockWithCooldown {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int n = prices.length;
        int hold = -prices[0]; // Initially, if we buy on day 0
        int sold = 0;          // Initially, no stock sold
        int rest = 0;          // Initially, just resting

        for (int i = 1; i < n; i++) {
            int prevHold = hold;
            int prevSold = sold;
            int prevRest = rest;

            // Transition
            hold = Math.max(prevHold, prevRest - prices[i]);  // buy or keep holding
            sold = prevHold + prices[i];                     // sell today
            rest = Math.max(prevRest, prevSold);              // stay resting
        }

        // The answer must be either sold or rest (not hold)
        return Math.max(sold, rest);
    }
}