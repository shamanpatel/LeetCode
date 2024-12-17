class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverseMap = new HashMap<>();
        String[] words = s.split(" ");

        // Check if the pattern length matches the number of words
        if (pattern.length() != words.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // Check if the character already maps to a word
            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) {
                    return false; // Mismatch in mapping
                }
            } 
            else 
            {
                map.put(c, word);
            }

            // Check the reverse mapping (word to character)
            if (reverseMap.containsKey(word)) {
                if (reverseMap.get(word) != c) {
                    return false; // Mismatch in reverse mapping
                }
            } 
            else 
            {
                reverseMap.put(word, c);
            }
        }

        return true;
    }
}
