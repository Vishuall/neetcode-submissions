class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Java generics don't support primitives — use Integer, not int
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        // Count frequency of each number
        for (int num : nums) {
            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
        }

        // Use a min-heap (priority queue) of size k, ordered by frequency
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> numsMap.get(a) - numsMap.get(b)
        );

        for (int num : numsMap.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll(); // remove least frequent
            }
        }

        // Build result array from heap
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = heap.poll();
        }

        return result;
    }
}