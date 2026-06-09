class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        if(n == 1){
            return nums[0] == target ? 0 : -1;
        }
        int l = n/2;
        int r = l + 1;
        while(l>=0){
            if(nums[l] == target){
                return l;
            }
            l--;
        }
        while(r<= (n-1)){
            if(nums[r] == target){
                return r;
            }
            r++;
        }
        return -1;
    }
}
