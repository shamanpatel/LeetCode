class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0; // Position to place the next non-zero element
        
        for (int i = 0; i < nums.length; i++) {// Move all non-zero elements to the front
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
       
        for (int i = index; i < nums.length; i++) { // Fill the remaining positions with zeroes
            nums[i] = 0;
        }
    }
}
