class Solution {
    public int maxProfit(int[] prices) {
        // decrate two variables r and l 
        // assign if prices[r] > prices[i] and r < prices.length - 1 then assign the delta into profit and r++
        // else if (!(r < prices.length -1){
        // l++}
        int l = 0;
        int r = 1;
        int maxP = 0;
        while(r < prices.length){
            if(prices[r] > prices[l]){
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            } else {
                l = r;
            }
            r++;
        }
        return maxP;
    }
}
