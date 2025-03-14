class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left = 1;
        int right = 10_000_000;
        int result = 0;

        while(left <= right){
            int middle = left + (right - left) / 2;
            long childerCount = 0;

            for(int i : candies){
                childerCount += i / middle;
            }
            if(childerCount >= k){
                result = middle;
                left = middle + 1;
            }
            else{
                right = middle - 1;
            }
        }
        return result;
    }
}