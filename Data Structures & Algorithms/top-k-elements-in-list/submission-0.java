class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hash = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
            Map.Entry.<Integer, Integer>comparingByValue().reversed()
        );

        int[] ans = new int[k];

        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i], hash.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            maxHeap.add(entry);
        }

        for (int j = 0; j < k; j++) {
            ans[j] = maxHeap.poll().getKey();
        }

        return ans;
    }
}
