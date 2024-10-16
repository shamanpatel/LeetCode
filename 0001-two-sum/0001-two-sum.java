class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> num = new HashMap<>();
        int[] index = new int[2];  //Initialize the index array
        
        for(int i = 0; i < nums.length; i++){
            int n = target - nums[i];  

            // Check if it exists in the HashMap
            if(num.containsKey(n)){
                index[0] = num.get(n);  // First index from the HashMap
                index[1] = i;           // Current index
                return index;         
            }

            // Add the current number and its index to the HashMap
            num.put(nums[i], i);
        }
        return null;
    }
}
