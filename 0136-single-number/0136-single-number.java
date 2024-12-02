class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0; // Simply use bit manupulation.
        for(int i = 0; i <= nums.length - 1; i++){ // Iterate through the array and do xor of every number.
            xor ^= nums[i];
        }
        return xor; // Return the xor operation.
    }
}