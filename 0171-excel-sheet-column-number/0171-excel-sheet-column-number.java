class Solution{
    public int titleToNumber(String columnTitle) {
        int result = 0; // Initialize the result to store the final column number.
        int length = columnTitle.length(); // Get the length of the column title.
        for (int i = 0; i < length; i++) {
            int c = columnTitle.charAt(i) - 'A' + 1; // Convert the character to its corresponding integer value.
            result = result * 26 + c; // Multiply result by 26 and add the current value.
        }
        return result;
    }
}