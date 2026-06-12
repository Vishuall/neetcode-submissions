class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int max = 0;
        int profit = 0;
        while(r < prices.length){
            if(prices[l] < prices[r]){
                profit = prices[r] - prices[l]; 
                r++;
            } else {
                l++;
                r = l + 1;
            }
            max = Math.max(profit, max);
        }
        return max;
    }
}
