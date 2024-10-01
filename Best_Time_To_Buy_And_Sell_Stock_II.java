class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0; // Initialize maximum profit to 0

        for (int i = 1; i < prices.length; i++) {
            // If today's price is greater than yesterday's price
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1]; // Add the profit
            }
        }

        return maxProfit; // Return the total profit
    }
}
