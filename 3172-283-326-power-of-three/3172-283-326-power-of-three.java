class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 0 || n < 1){
            return false;
        }
        // The largest power of 3 that fits in an integer is 3^19 = 1162261467
        return 1162261467 % n == 0;
    }
}