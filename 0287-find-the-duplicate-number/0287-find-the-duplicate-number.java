class Solution {
    public int findDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while(low < high){
            int middle = low + (high - low) / 2; //  Find middle elment.
            int count = 0; // Set count to 0.

            for(int n : nums){ // For loop to get the count of repetead number.
                if(n <= middle){
                    count++;
                }
            }
            if(count <= middle){  // If count is less than equal to middle set new low.
                low = middle + 1;
            }
            else{
                high = middle; // CHnage the middle to high.
            }
        }
        return low;
    }
}