class Solution {
    public int longestConsecutive(int[] nums) {
      if(nums.length == 0){
        return 0;
      }
        // we can sort the array
        Arrays.sort(nums);
        int longestStreak = 1;
        int currentStreak = 1;
        // Loop through sorted array
        for (int i = 1; i < nums.length; i++) {  // Fix: start at 1, check i < length
            
            // Condition 1: Skip duplicates
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Check if consecutive (difference of 1)
            if (nums[i] == nums[i - 1] + 1) {
                currentStreak++;
            } 
            else {
                // Sequence broken, update longest and reset current
                longestStreak = Math.max(longestStreak, currentStreak);
                currentStreak = 1;
            }
        }
        
        // Don't forget to check the last streak
        return Math.max(longestStreak, currentStreak);
    }
}