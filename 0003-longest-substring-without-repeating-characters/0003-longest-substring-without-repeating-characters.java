class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();

        int left = 0; 
        int right = 0;  
        int size = s.length(); // Length of the input string
        int ans = 0;   // Variable to store the length of the longest substring

        // Loop through the string using the right pointer
        while (right < size) {
            // If the character is already in the hash, move the left pointer to avoid repeating characters
            if (hash.containsKey(s.charAt(right))) {
                // Update the left pointer to the next position after the last occurrence of the current character
                left = Math.max(hash.get(s.charAt(right)) + 1, left);
            }

            // Add/update the character's index in the hash map
            hash.put(s.charAt(right), right);

            // Calculate the current length of the substring and update the answer if it's the longest so far
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}