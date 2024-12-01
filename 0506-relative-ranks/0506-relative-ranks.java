class Solution {
    public String[] findRelativeRanks(int[] score) {
        // PriorityQueue to store the indices of scores in descending order of their values.
        // Custom comparator sorts based on the score values in descending order.
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> score[b] - score[a]);
        int n = score.length;
        String[] result = new String[n]; // Array to store the rank results for each athlete
        
        // Add indices of scores to the maxHeap
        for (int i = 0; i < n; i++) {
            maxHeap.add(i);
        }
        
        int i = 1; // Rank starts from 1
        // Process the heap to assign ranks
        while (!maxHeap.isEmpty()) {
            int index = maxHeap.poll(); // Get the index of the score with the highest value
            
            // Assign rank based on position
            if (i > 3) {
                result[index] = Integer.toString(i); // Convert the rank to string for scores beyond the top 3
            } else if (i == 1) {
                result[index] = "Gold Medal"; // First place
            } else if (i == 2) {
                result[index] = "Silver Medal"; // Second place
            } else if (i == 3) {
                result[index] = "Bronze Medal"; // Third place
            }
            i++; // Increment rank for the next score
        }
        
        return result; // Return the array of ranks
    }
}
