class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (nums[middle] == target) {
                return middle; // Target found
            }
           
            if (nums[low] <= nums[middle]) {  // Check if the left half is sorted.
                
                if (nums[low] <= target && target < nums[middle]) { // Check if target is in the left half.
                    high = middle - 1;
                } 
                else {
                    low = middle + 1;
                }
            } 
            else { // Right half is sorted
                
                if (nums[middle] < target && target <= nums[high]) { // Check if target is in the right half
                    low = middle + 1;
                } 
                else {
                    high = middle - 1;
                }
            }
        }

        return -1; 
    }
}
