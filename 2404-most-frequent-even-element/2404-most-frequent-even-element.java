class Solution {
    public int mostFrequentEven(int[] nums) {
        // Step 1: Create a HashMap to count frequencies of even numbers
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            if (num % 2 == 0) { // Only consider even numbers
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
        }

        // Step 2: Find the most frequent even number
        int mostFrequent = -1; // Default value if no even number exists
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            // Update the result if:
            // 1. Current frequency is greater than maxFrequency
            // 2. Frequency is equal, but the number is smaller
            if (frequency > maxFrequency || (frequency == maxFrequency && number < mostFrequent)) {
                mostFrequent = number;
                maxFrequency = frequency;
            }
        }

        return mostFrequent;
    }
}
