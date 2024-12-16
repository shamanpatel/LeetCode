public class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder(); // Create a new String to insert the characters.
        while (columnNumber > 0) { 
            columnNumber--; // Reduce the number at every iteration
            char c = (char) ('A' + columnNumber % 26); // Convert the number after mod to character
            result.insert(0, c); // Insert the chaaracter in to the string
            columnNumber /= 26; // Divide the number with 26.
        }
        return result.toString();
    }
}