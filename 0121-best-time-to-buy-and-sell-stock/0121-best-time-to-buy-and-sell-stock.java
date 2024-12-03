class Solution {
    public int maxProfit(int[] prices) {
        // Initialize the maximum profit to 0
        int profit = 0;
        int buy = prices[0];

        for (int i = 1; i < prices.length; i++) { // Iterate through the array
            if(prices[i] < buy){ // If the next element is smaller than the current pointer, move the pointer
                buy = prices[i]; 
            }
            else if(prices[i] - buy > profit){ // Else if greater, than update the profit, if its gretaert than profit
                profit = prices[i] - buy;
            }
        }
    
        return profit; // Return the maximum profit;
    }
}
