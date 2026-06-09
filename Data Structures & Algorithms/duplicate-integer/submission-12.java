class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));
        if(nums.length > seen.size()){
            return true;
        }
        return false;
    }
}