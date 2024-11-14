class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        
        while (low < high) {
            int middle = low + (high - low) / 2;
            
            // Ensure we are checking pairs properly (middle should always be even for comparison)
            if (middle % 2 == 1) {
                middle--;  // Adjust to be the left element of the pair
            }
            
            // Compare the middle element with the next one
            if (nums[middle] == nums[middle + 1]) {
                // If they are the same, the unique element is on the right side
                low = middle + 2;
            } else {
                // If they are different, the unique element is on the left side
                high = middle;
            }
        }
        
        return nums[low];
    }
}
