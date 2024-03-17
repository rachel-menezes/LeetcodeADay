//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
    public int maxProfit(int[] prices) {
        int current_min = Integer.MAX_VALUE;
        int max_profit = 0;
        
        for(int i =0 ; i < prices.length; i++){
            current_min = Math.min(current_min , prices[i]);
            max_profit = Math.max(max_profit, prices[i] - current_min);
        }
    return max_profit;
    }
}