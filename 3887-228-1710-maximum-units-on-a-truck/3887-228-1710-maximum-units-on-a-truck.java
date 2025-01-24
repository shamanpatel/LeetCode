class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]); // Sort the array according to the number of units.
        int units = 0;
        for (int[] i : boxTypes) {
            int count = Math.min(i[0], truckSize);
            units += count * i[1]; // Multiply the size with units.
            truckSize -= count; // Reduce the truckSize as we count the number of boxes.
			if (truckSize == 0){ // If the size is zero return units.
                return units;
            } 
        }
        return units;
    }
}