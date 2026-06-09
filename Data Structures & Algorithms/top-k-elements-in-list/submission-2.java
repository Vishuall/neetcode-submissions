class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> countMap = new HashMap<>();

        // count frequency
        for (int i = 0; i < nums.length; i++) {

            if (countMap.containsKey(nums[i])) {
                countMap.put(nums[i], countMap.get(nums[i]) + 1);
            } else {
                countMap.put(nums[i], 1);
            }
        }

        // store keys in list
        ArrayList<Integer> list = new ArrayList<>(countMap.keySet());

        // sort based on frequency
        Collections.sort(list, (a, b) -> countMap.get(b) - countMap.get(a));

        // create result array
        int[] result = new int[k];

        // store top k frequent elements
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}