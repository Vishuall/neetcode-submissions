class Solution {
    public boolean hasDuplicate(int[] nums) {
        // create a hashmap
        HashSet<Integer> newHash = new HashSet<>();
        // run a loop -- if element not present assign key and count would be one
        for(int num: nums){
            if(newHash.contains(num)){
                return true;
            }
            newHash.add(num);
        }
        return false;
    }
}