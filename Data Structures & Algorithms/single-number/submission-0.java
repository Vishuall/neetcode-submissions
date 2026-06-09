class Solution {
    public int singleNumber(int[] nums) {
        // run a for loop
        // user XOR operator
        int result = nums[0];
        for(int i = 1; i < nums.length; i++){
            result = result ^ nums[i];
        }
        return result;
    }
}
