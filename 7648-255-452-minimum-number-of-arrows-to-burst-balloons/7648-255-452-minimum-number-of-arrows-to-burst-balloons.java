class Solution {
    public int findMinArrowShots(int[][] points) { // Tricky question but try to understand the question first.
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1])); // Sort the array.
        int current = points[0][1]; 
        int count = 1; // Initialize the count to 1 as we need atleast one arrow.
        for(int i = 1; i < points.length; ++i){
            if(points[i][0] > current){ // If current is greater than the second pointer of the second coordinates of the array.
               count++; // Increment the counter.
               current = points[i][1]; // Now change the value of current. 
            }
            
        }
        return count;
    }
}