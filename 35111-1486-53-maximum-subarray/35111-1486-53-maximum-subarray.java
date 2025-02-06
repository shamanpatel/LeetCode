class Solution {
    public int maxSubArray(int[] nums) {
        int max = 0;
        int result = nums[0];
        for(int i = 0; i < nums.length; i++){
            max += nums[i];
            result = Math.max(max, result);
            if(max < 0){
                max = 0;
            }
        }
        return result;
    }
}