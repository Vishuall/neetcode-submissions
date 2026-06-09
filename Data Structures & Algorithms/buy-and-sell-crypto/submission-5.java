class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxP = 0;
        while(r < prices.length){
            int profit = prices[l] < prices[r] ? prices[r] - prices[l] : 0;
            maxP = Math.max(profit, maxP);
            if(r == prices.length - 1){
                l++;
                r = l + 1;
            } else {
                r++;
            }
        }
        return maxP;
    }
}
