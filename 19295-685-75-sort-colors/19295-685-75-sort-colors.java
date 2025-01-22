class Solution {
    public void sortColors(int[] nums) {
        int count_zeroes = 0, count_ones = 0; // Calculate the count of 0 and 1
        for(int i : nums){ 
            if(i == 0){
                count_zeroes++;
            }
            else if(i == 1){
                count_ones++;
            }
        }
        for(int i = 0; i < count_zeroes; i++){ // Now change the array till the length of count of 0's.
            nums[i] = 0;
        }
        for(int i = count_zeroes; i < count_zeroes + count_ones; i++){ // Same for 1's
            nums[i] = 1;
        }
        for(int i = count_zeroes + count_ones; i < nums.length; i++){ // Now place 2 in the rest of the remaning elements.
            nums[i] = 2;
        }
    }
}