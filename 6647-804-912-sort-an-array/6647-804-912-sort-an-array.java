class Solution {
    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) {
            return nums; // Base case: an array with one or no elements is already sorted
        }
        mergeSort(nums, 0, nums.length - 1); // Sort the array using merge sort
        return nums; // Return the sorted array
    }

    public void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return; // Base case: if the range contains only one element
        }
        
        int mid = left + (right - left) / 2; // Calculate the middle index
        
        mergeSort(nums, left, mid); // Recursively sort the left half
        mergeSort(nums, mid + 1, right); // Recursively sort the right half
        
        merge(nums, left, mid, right); // Merge the sorted halves
    }

    public void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1]; // Temporary array for merging
        int i = left, j = mid + 1, k = 0; // Initialize pointers for left, right, and temp arrays
        
        while (i <= mid && j <= right) { // Merge elements in sorted order
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        
        while (i <= mid) { // Copy remaining elements from the left half
            temp[k++] = nums[i++];
        }
        
        while (j <= right) { // Copy remaining elements from the right half
            temp[k++] = nums[j++];
        }
        
        for (k = 0; k < temp.length; k++) { // Copy the merged array back into the original array
            nums[left + k] = temp[k];
        }
    }
}
