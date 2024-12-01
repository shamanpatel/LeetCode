class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each number using a HashMap
        HashMap<Integer, Integer> frequent = new HashMap<>();
        for (int num : nums) {
            frequent.put(num, frequent.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a Min-Heap (PriorityQueue) to keep track of the top K elements
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue() // Compare entries based on their frequency (ascending order)
        );

        // Step 3: Add entries to the heap
        for (Map.Entry<Integer, Integer> entry : frequent.entrySet()) {
            minHeap.add(entry); // Add current entry to the heap
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the entry with the smallest frequency when size exceeds k
            }
        }

        // Step 4: Extract the top K elements from the heap
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll().getKey(); // Extract the key (number) from the heap
        }

        return result; // Return the result array containing the top K frequent elements
    }
}
