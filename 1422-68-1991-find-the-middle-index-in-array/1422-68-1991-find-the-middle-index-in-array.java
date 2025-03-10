class Solution {
    public int findMiddleIndex(int[] nums) {
    if (nums == null || nums.length == 0){
        return -1;
    }
    int sum = 0; 
    for (int i = 0; i < nums.length; i++) {
        sum += nums[i]; 
    }
    int prefix = 0;
    int suffix = 0; 
    for (int i = 0; i < nums.length; i++) {
        suffix = sum - prefix;
        prefix += nums[i]; 
        if (prefix == suffix) {
            return i;
        }
    }
    return -1;
  }
}