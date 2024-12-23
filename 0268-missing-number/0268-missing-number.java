class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums); // Binary Search Approach
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int middle = low + (high - low) / 2;
            if(nums[middle] == middle){
                low = middle + 1;
            }
            else{
                high = middle - 1;
            }
        }
        return low;
    }
}