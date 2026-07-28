class Solution { 
    public int longestConsecutive(int[] nums) {
        // Fix 1: Handle empty array edge case
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums); 
        
        int l = 0; 
        int r = 1; 
        int max = 1; 
        Set<Integer> set = new HashSet<>(); 
        
        // Base case: add the first element to start the sequence
        set.add(nums[l]);

        while (r < nums.length) {
            // Fix 2: Skip duplicates and safely continue the loop
            if (nums[r] == nums[r - 1]) {
                r++;
                continue; 
            }
            
            // Fix 3: Standardize how elements enter the set
            if (nums[r] == (nums[r - 1] + 1)) {
                set.add(nums[r]);
                r++;
            } else {
                // Fix 4: Reset cleanly when sequence breaks
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
