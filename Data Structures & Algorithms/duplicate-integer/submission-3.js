class Solution {
    hasDuplicate(nums) {
        nums.sort((a, b) => a - b); // important for numbers
        for (let i = 0; i < nums.length - 1; i++) {
            if (nums[i] === nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}