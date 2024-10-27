class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> num = new HashMap<>(); // HashMap for storing the frequency of numbers
        for(int n : arr){
            num.put(n, num.getOrDefault(n, 0) + 1);
        }
        Set<Integer> freq = new HashSet<>(); // HashSet to store the values of frequency
        for(int n : num.values()){
            freq.add(n);
        }
        return num.size() == freq.size(); // Check if the size of both matches then return true.
    }
}