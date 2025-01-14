class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Create a new matrix for the transposed result
        int[][] transposed = new int[cols][rows];
        
        // Populate the transposed matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        
        return transposed;
    }
}
