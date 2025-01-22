class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums); // Sort the array.
        for(int i = nums.length - 1; i >= 2; i--){ // Loop from the end on the array.
            if(nums[i] < nums[i - 1] + nums[i - 2]){ // If the current index is less than sum of previous two indxes return their sum.
                return nums[i] + nums[i - 1] + nums[i - 2]; 
            }
        }
        return 0; // Else return zero.
    }
}