class Solution {
    public void reverseString(char[] s) {
        int i = 0; // Two pointer approach
        int j = s.length - 1;
        while(i < j){ 
            char temp = s[i]; // Use temporary variable to store the character
            s[i] = s[j]; // Store the character at j to the character at i.
            s[j] = temp; // Store the temporary to j.
            i++; // Increment the i and decrement the j.
            j--;
        }
    }
}