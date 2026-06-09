class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        // Count frequency of each number
        for (int num : nums) {
            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
        }

        // Sort keys by frequency in descending order
        List<Integer> keys = new ArrayList<>(numsMap.keySet());
        keys.sort((a, b) -> numsMap.get(b) - numsMap.get(a));

        // Pick the first k keys
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = keys.get(i);
        }

        return result;
    }
}