class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        // Create a 2D array to store all cell coordinates in the grid
        int[][] result = new int[rows * cols][2]; // Initialize the array with the size of all cells in the grid
        int index = 0; // Index to keep track of the current position in the result array

        // Fill the result array with all grid coordinates (row, col)
        for (int i = 0; i < rows; i++) { // Loop through each row
            for (int j = 0; j < cols; j++) { // Loop through each column
                result[index][0] = i; // Store the row coordinate
                result[index][1] = j; // Store the column coordinate
                index++; // Move to the next index
            }
        }

        // Sort the cells in the result array based on their Manhattan distance from the center
        Arrays.sort(result, new Comparator<int[]>() { // Use a custom comparator for sorting
            public int compare(int[] a, int[] b) {
                // Calculate Manhattan distance for cell 'a'
                int x = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
                // Calculate Manhattan distance for cell 'b'
                int y = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
                return x - y; // Sort by increasing distance
            }
        });

        // Return the sorted result array
        return result;
    }
}
