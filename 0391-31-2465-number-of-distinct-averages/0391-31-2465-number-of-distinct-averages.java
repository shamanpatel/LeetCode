class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Double> set = new HashSet<>();
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            double average = (nums[left] + nums[right]) / 2.0;
            set.add(average);
            left++;
            right--;
        }
        return set.size();
    }
}