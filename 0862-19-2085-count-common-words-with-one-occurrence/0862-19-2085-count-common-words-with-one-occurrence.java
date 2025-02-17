import java.util.HashMap;

class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        int count = 0;

        // Count frequency of words in words1
        for (String word : words1) {
            map1.put(word, map1.getOrDefault(word, 0) + 1);
        }

        // Count frequency of words in words2
        for (String word : words2) {
            map2.put(word, map2.getOrDefault(word, 0) + 1);
        }

        // Check for words that appear exactly once in both arrays
        for (String word : map1.keySet()) {
            // Ensure the word appears exactly once in both arrays
            if (map1.get(word) == 1 && map2.getOrDefault(word, 0) == 1) {
                count++;
            }
        }

        // Return the count of words that meet the condition
        return count;
    }
}
