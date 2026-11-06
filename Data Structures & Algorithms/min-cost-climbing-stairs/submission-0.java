class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prev0 = cost[0];
        int prev1 = cost[1];

        for(int i = 2; i < cost.length; i++){
            int current = cost[i] + Math.min(prev0, prev1);

            prev0 = prev1;
            prev1 = current;
        }
        return Math.min(prev0, prev1);
    }
}
