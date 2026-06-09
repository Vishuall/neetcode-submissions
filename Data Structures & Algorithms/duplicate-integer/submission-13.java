class Solution {
    public boolean hasDuplicate(int[] nums) {
        int l = 0;
        int r = 1;
        while(l < r && l < nums.length - 1){
            if(nums[l] == nums[r]){
                return true;
            }
            else if(nums[l] != nums[r] && r < nums.length - 1){
                r++;
            } else if(r == nums.length - 1){
                l++;
                r = l + 1;
            } else {
                return false;
            }
        }
        return false;
    }
}