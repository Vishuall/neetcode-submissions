class Solution {
    public int findMin(int[] nums) {
       if(nums[0] < nums[nums.length - 1] || nums.length == 1){
        return nums[0];
       }
       int r = nums.length - 1;
       while(0 <= r){
        if(nums[0] > nums[r]){
            r--;
        } else{
            r++;
            return nums[r];
        }
       }
       return nums[0];
    }
}
