class Solution {
    public int longestSubarray(int[] nums) {
        int start = 0;
        int maxLen = 0;
        int zeroCount = 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeroCount--;
            }
            while(zeroCount < 0){
                if(nums[start] == 0){
                    zeroCount++;
                }
                start++;
            }
            maxLen = Math.max(maxLen, i - start);
        }
        return maxLen;
    }
}