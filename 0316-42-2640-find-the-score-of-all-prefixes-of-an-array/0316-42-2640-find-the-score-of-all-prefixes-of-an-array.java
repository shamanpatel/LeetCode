class Solution {
    public long[] findPrefixScore(int[] nums) {
        int max = nums[0];
        long[] result = new long[nums.length];
        result[0] = 2 * nums[0];
        for(int i = 1; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            result[i] = result[i - 1] + nums[i] + max;
        }
        return result;
    }
}