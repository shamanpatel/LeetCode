class Solution {
    public List<String> commonChars(String[] words) {
        
        HashMap<Character, Integer> common = new HashMap<>(); // Initialize the first map to store frequency of first word
        for(char ch : words[0].toCharArray()){
            common.put(ch, common.getOrDefault(ch, 0) + 1); // Update frequency of each character in the first word
        }

       
        for(int i = 1; i < words.length; i++){  // Comparing the first word with rest of the words in the array.
            HashMap<Character, Integer> current = new HashMap<>();
            for(char ch : words[i].toCharArray()){
                current.put(ch, current.getOrDefault(ch, 0) + 1); // Count frequency of each character in current word
            }
            common = CommonCharacters(common, current); // Get common characters between the maps
        }

        
        List<String> result = new ArrayList<>(); // Created a Arraylist to put the common characters.
        for(Map.Entry<Character, Integer> entry : common.entrySet()){
            for(int i = 0; i < entry.getValue(); i++){
                result.add(entry.getKey().toString()); // Add each common character as many times as its frequency
            }
        }
        return result;
    }

    // Helper method to find common characters and their minimum frequency between two maps
    public HashMap<Character, Integer> CommonCharacters (HashMap<Character, Integer> map1, HashMap<Character, Integer> map2){
        HashMap<Character, Integer> res = new HashMap<>();
        for(Map.Entry<Character, Integer> entry : map1.entrySet()){
            if(map2.containsKey(entry.getKey())){ 
                res.put(entry.getKey(), Math.min(entry.getValue(), map2.get(entry.getKey()))); // Retain the lower frequency
            }
        }
        return res; // Return the map of common characters
    }
}
