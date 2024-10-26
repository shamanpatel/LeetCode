class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); //Creating a HashMap for storing the values and frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(map.entrySet()); // Convert the HashMap in List
        sortedEntries.sort((a, b) -> b.getValue().compareTo(a.getValue())); // Stored the values in descending order

        int[] result = new int[k]; // Taking the elemts with frequency of k and more than k.
        for (int i = 0; i < k; i++) {
            result[i] = sortedEntries.get(i).getKey(); // Add the values to array result.
        }

        return result;
    }
}
