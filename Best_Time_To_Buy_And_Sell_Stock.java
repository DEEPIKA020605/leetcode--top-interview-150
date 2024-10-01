class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Initialize minPrice to a high value
        int maxProfit = 0; // Initialize maxProfit to 0

        for (int price : prices) {
            // Update the minimum price encountered so far
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit if sold at current price
            int profit = price - minPrice;
            // Update maxProfit if this profit is higher
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit; // Return the maximum profit
    }
}
