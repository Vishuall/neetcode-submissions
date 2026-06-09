class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = prices.length - 1;
        int maxProfit = 0;
        while(l <= r){
            if(l < r){
                if(prices[r] > prices[l]){
                    int profit = prices[r] - prices[l];
                    maxProfit = Math.max(profit, maxProfit);
                }
                r--;
            } else if(l==r){
                l++;
                r = prices.length - 1;
            }
        }
        return maxProfit;
    }
}
