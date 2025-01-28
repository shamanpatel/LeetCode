import java.util.*;

class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums); // Sort the array to simplify the distance calculation
        
        int n = nums.length;
        int left = 0;
        int right = nums[n - 1] - nums[0]; // Maximum possible distance
        
        // Binary search for the k-th smallest distance
        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = countPairs(nums, mid);
            
            if (count < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
    
    // Helper function to count pairs with a distance less than or equal to mid
    private int countPairs(int[] nums, int maxDist) {
        int count = 0;
        int n = nums.length;
        int j = 0;
        
        for (int i = 0; i < n; i++) {
            while (j < n && nums[j] - nums[i] <= maxDist) {
                j++;
            }
            count += j - i - 1; // Pairs formed with nums[i]
        }
        
        return count;
    }
}