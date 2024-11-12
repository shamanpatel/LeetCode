class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (nums[middle] == target) {
                return true;  // Target found
            }

            if (nums[low] == nums[middle] && nums[middle] == nums[high]) { // Handle duplicates: skip duplicates
                low++;
                high--;
            } 
          
            else if (nums[low] <= nums[middle]) {  // Left half is sorted
                if (nums[low] <= target && target < nums[middle]) {
                    high = middle - 1;  // Target in the left sorted part
                } 
                else {
                    low = middle + 1;   // Target in the right part
                }
            } 
           
            else {
                if (nums[middle] < target && target <= nums[high]) {
                    low = middle + 1;   // Target in the right sorted part
                } 
                else {
                    high = middle - 1;  // Target in the left part
                }
            }
        }

        return false;  // Target not found
    }
}
