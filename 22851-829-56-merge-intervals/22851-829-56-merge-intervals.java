class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // Sort the intervals based on the start times.
        List<int[]> merged = new ArrayList<>();

        // Step 3: Iterate through the intervals.
        for (int[] interval : intervals) {
            // If the list is empty or the current interval does not overlap with the last one,
            // add it to the list.
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // Otherwise, merge the current interval with the last one by updating the end time.
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // Convert the list to a 2D array and return it.
        return merged.toArray(new int[merged.size()][]);
    }
}
