class NumArray {

    private int[] prefixSum;
    public NumArray(int[] nums) {
        this.prefixSum = new int[nums.length];
        if(nums.length > 0) {
        this.prefixSum[0] = nums[0];
        }
        for(int i = 1; i< nums.length;i++) {
            this.prefixSum[i] = nums[i] + this.prefixSum[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return this.prefixSum[right] -  ((left - 1 < 0) ? 0 : this.prefixSum[left - 1 ]);
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */