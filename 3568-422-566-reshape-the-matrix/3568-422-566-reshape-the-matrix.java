class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // Check if the reshape is possible
        if ((mat.length) * (mat[0].length) != r * c) {
            return mat; // If not possible, return the original matrix
        }
        
        // Initialize the result matrix
        int[][] result = new int[r][c];
        int index = 0; // To track the position in the 1D mapping
        
        // Iterate through each element of the input matrix
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                result[index / c][index % c] = mat[i][j]; // Map 1D index to 2D indices
                index++; // Move to the next position in the 1D mapping
            }
        }
        
        return result; // Return the reshaped matrix
    }
}
