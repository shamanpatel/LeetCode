class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while(low < high){
            int middle = low + (high - low) / 2;
            if(nums[middle] < nums[middle + 1]){
                low = middle + 1;
            }
            else{
                high = middle;
            }
        }
        return low;
    }
}