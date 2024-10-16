class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>(); //Created a map to store the frequency of each number
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        Integer[] num = Arrays.stream(nums).boxed().toArray(Integer[]::new); // Converted the int[] to Integer[] to allow sorting
        
        
        Arrays.sort(num, (a, b) -> { // Sort the array based on frequency, and if frequencies are the same, by value
            int freqA = frequencyMap.get(a);  // Get the frequency of a
            int freqB = frequencyMap.get(b);  // Get the frequency of b
            
           
            if (freqA != freqB) {  // If frequencies are different, sort by frequency (ascending).
                return Integer.compare(freqA, freqB);
            } 
           
            else {
                return Integer.compare(b, a);   // If frequencies are the same, sort by value (descending).
            }
        });
        
       
        for (int i = 0; i < nums.length; i++) {  // Converted the sorted Integer[] back to int[].
            nums[i] = num[i];
        }
     
        return nums;
    }
}
