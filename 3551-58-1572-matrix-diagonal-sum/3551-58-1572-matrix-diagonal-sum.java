class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0; // Initialize the sum to 0
        int n = mat.length; // Get the size of the square matrix (number of rows/columns)

        // Loop through each row (or column, since it's a square matrix)
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i]; // Add the element from the primary diagonal (top-left to bottom-right)

            // Check if the current element is not on the same position for both diagonals
            if (i != n - i - 1) {
                sum += mat[i][n - i - 1]; // Add the element from the secondary diagonal (top-right to bottom-left)
            }
        }

        return sum; // Return the total sum of the diagonal elements
    }
}
