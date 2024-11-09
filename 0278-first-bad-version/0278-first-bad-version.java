/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int bad  = 1; // Initalize the bad to 1.
        while(low <= high){
            int middle = low + (high - low) / 2; // Find the middle element.
            if(isBadVersion(middle)){
                bad = middle; // If the middle element is bad than assign new bad
                high = middle - 1; // And move high pointer to left of middle.
            }
            else{
                low = middle + 1; // If not move low to right of middle.
            }
        }
        return bad; 
    }
}