class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
         int[] result = {-1, -1};
        
        while (low <= high) {   // Finding the first occurrence.
            int middle = low + (high - low) / 2;
            if (nums[middle] == target) {   // Check for the first occurrence
                result[0] = middle;
                high = middle - 1; // Continue searching in the left half
            } 

            else if (nums[middle] < target) {
                low = middle + 1;
            } 
            
            else {
                high = middle - 1;
            }
        }
        
        low = 0;
        high = nums.length - 1;
        
        // Find the last occurrence
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (nums[middle] == target) {
                result[1] = middle; // Check for the last occurrence
                low = middle + 1; // Continue searching in the right half
            } 
            else if (nums[middle] < target) {
                low = middle + 1;
            } 
            else {
                high = middle - 1;
            }
        }
        
        return result;
    }
}
