class Solution {
    public boolean judgeSquareSum(int c) {
        int low = 0; // Instead of calculating middle, find sqrt of number c.
        long high = (long)Math.sqrt(c);
        while(low <= high){
            long sum = low * low + high * high;
            if(sum == c){ // If sum matches then return true
                return true;
            }
            else if(sum < c){ // If the sum is low increment the low
                low++;
            }
            else{
                high -= 1; // Else decrement it
            }
        }
        return false;
    }
}