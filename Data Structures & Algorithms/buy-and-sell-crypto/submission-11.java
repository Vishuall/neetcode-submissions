class Solution {
    public int maxProfit(int[] prices) {
        // traverse array using two pointers from opposite array
        int l = 0;
        int r = 1;
        int diff = 0;
        int res = 0;
        while(r < prices.length){
            if(prices[r] > prices[l]){
                diff = prices[r] - prices[l];
            } else {
                l = r;
            }
            res = Math.max(diff,res);
            r++;
        }
        return res;
    }
}
