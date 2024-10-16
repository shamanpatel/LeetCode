class Solution {
    public int majorityElement(int[] nums) {
    Map<Integer, Integer> num = new HashMap<>();
    
    // Iterate through the array to count the occurrences of each number
    for(int i = 0; i < nums.length; i++){
        // If nums[i] is not in the map, add it with a count of 1, otherwise increment its count
        num.put(nums[i], num.getOrDefault(nums[i], 0) + 1);
    }
    
    // Iterate again to find the majority element
    for(int i = 0; i < nums.length; i++){
        // Check if the count of nums[i] is greater than half length of the array
        if(num.get(nums[i]) > (nums.length / 2)){
            return nums[i]; // Return the majority element
        }
    }
    
    return 0;
}

}

