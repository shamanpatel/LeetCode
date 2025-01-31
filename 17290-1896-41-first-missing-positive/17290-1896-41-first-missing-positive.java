class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        int firstPositive = 1;
        while (map.containsKey(firstPositive)) {
            firstPositive++;
        }
        
        return firstPositive;
    }
}
