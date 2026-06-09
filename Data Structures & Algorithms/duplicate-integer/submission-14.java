class Solution {
    public boolean hasDuplicate(int[] nums) {
        // create a hashmap
        HashSet<Integer> newHash = new HashSet<>();
        for(int num: nums){
            if(newHash.contains(num)){
                return true;
            }
            newHash.add(num);
        }
        return false;
    }
}