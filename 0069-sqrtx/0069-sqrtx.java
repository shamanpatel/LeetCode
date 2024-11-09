class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) { // Special pr edge case
            return x;
        }

        int low = 0;
        int high = x;
        int result = 0; // Initial the square root is 0.

        while (low <= high) {
            int middle = low + (high - low) / 2; // The middle element.

            if  ((long)middle * middle == x) { // I f middle is squareroot, then return it.
                return middle;
            } 
            else if ((long)middle * middle < x){ // If square of middle is less than x
                result = middle; // The new result will be middle.
                low = middle + 1; // Change the low.
            } 
            else{
                high = middle - 1;
            }
        }

        return result;
    }
}
