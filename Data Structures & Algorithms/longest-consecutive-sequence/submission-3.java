class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        // [2,3,4,4,5,10,20]
        int l = 0;
        int r = 1;
        int max = 1;
        Set<Integer> set = new HashSet<>();
        set.add(nums[l]);
        while(r < nums.length){
            if(nums[r] == nums[r-1]){
                r++;
                continue;
            }
            if(nums[r] == (nums[r - 1] + 1)){
                set.add(nums[r]);
                r++;
            } else {
                l = r;
                r = l + 1;
                set.clear();
                set.add(nums[l]); 
            }
            max = Math.max(max, set.size());
        }
        return max;
    }
}
