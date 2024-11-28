class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1; // Binary Search approach
        int high = 0;
        for(int i : piles){ // Get the high from the piles array using max operation.
            high = Math.max(high, i);
        }
        while(low < high){
            int middle = low + (high - low) / 2; 
            if(Hours(piles, middle) <= h){ // If the total hours is less than h
                high = middle; // Set high to middle
            }
            else{
                low = middle + 1; // Else low to next of middle.
            }
        }
        return low;
    }
    public int Hours(int[] piles, int speed){ // Helper method to calculate the Hours.
        int hours = 0; // Set the hours to 0.
        for(int i : piles) {
            hours += Math.ceil((double) i / speed); // Get the total hours using math ceil function.
        }
        return hours;
    }
}
