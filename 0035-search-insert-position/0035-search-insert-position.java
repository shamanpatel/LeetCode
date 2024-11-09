class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0; // Implemting basic binary search algorithm. Take two pointer one at position 0.
        int high = nums.length - 1; // Another one at last position.
        while(low <= high){  
            int middle = low + (high - low) / 2; // Find out the middle element from the array.
            if(nums[middle] == target){ // If it matches with target return middle.
                return middle;
            }
            else if (target > nums[middle]){ // If the target is great than middle, set new low pointer.
                low = middle + 1;
            }
            else{ // Else change the high pointer
                high = middle - 1;
            }

        }
        return low;
    }
}