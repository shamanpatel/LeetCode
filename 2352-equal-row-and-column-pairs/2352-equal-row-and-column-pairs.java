class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> map = new HashMap<>();  // HashMap to store each row as a string with its frequency
        int n = grid.length;  // Get the size of the grid (n x n)
        
        // Loop through each row in the grid
        for (int i = 0; i < n; ++i) {
            StringBuilder equal = new StringBuilder();  // StringBuilder to build a string representation of the row
            for (int j = 0; j < n; ++j) {
                equal.append('0' + grid[i][j]);  // Append each element in the row to the StringBuilder
            }
            String s = equal.toString();  // Convert StringBuilder to a string
            map.put(s, map.getOrDefault(s, 0) + 1);  // Store the row string in the HashMap with its frequency
        }
        
        int ans = 0;  // Initialize the count of equal pairs
       
        for (int i = 0; i < n; ++i) {   // Loop through each column in the grid
            StringBuilder equal = new StringBuilder();  // StringBuilder to build a string representation of the column
            for (int j = 0; j < n; ++j) {
                equal.append('0' + grid[j][i]);  // Append each element in the column to the StringBuilder
            }
            String s = equal.toString();  // Convert StringBuilder to a string
            ans += map.getOrDefault(s, 0);  // Add the frequency of this column string in the HashMap to the answer
        }
        
        return ans;  // Return the total count of equal row and column pairs
    }
}
