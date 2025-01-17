class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // HashMaps to store character frequencies for both strings
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        if (s1.length() > s2.length()) {
            return false;
        }

        // Initialize the frequency maps for s1 and the first window of s2 (same size as s1)
        for (int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1); 
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
        }

        // If the frequency map of s1 matches the frequency map of the first window in s2, return true
        if (map1.equals(map2)) {
            return true;
        }

        // Use a sliding window approach to check the rest of s2
        int j = 0; // Left pointer for the sliding window
        for (int i = s1.length(); i < s2.length(); i++) { // Iterate through the rest of s2
            char right = s2.charAt(i); // Character entering the window from the right
            map2.put(right, map2.getOrDefault(right, 0) + 1); // Update frequency of the new character

            char left = s2.charAt(j); // Character leaving the window from the left
            map2.put(left, map2.get(left) - 1); // Decrement frequency of the character leaving the window
            
            // If the frequency of the left character becomes 0, remove it from the map to keep the size minimal
            if (map2.get(left) == 0) {
                map2.remove(left);
            }
            
            j++; // Move the left pointer to the right, effectively sliding the window

            // Check if the current window's frequency map matches the frequency map of s1
            if (map1.equals(map2)) {
                return true;
            }
        }
        return false;
    }
}
