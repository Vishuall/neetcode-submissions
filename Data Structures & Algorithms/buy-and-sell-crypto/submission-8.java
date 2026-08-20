class Solution {
    public int maxProfit(int[] prices) {
        // this is for maintaining lowest element
        int bestMin = prices[0];
        // this is for maintaining highest difference
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] > bestMin){
                maxProfit = Math.max(maxProfit, prices[i] - bestMin);
            }
            bestMin = Math.min(bestMin, prices[i]);
        }
        return maxProfit;
    }
}
