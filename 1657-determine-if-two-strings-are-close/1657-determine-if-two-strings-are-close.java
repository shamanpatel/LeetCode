class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>(); // HashMap for storing the frequency of each characters
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < word1.length(); i++){ // Added the charcters in HashMap.
            char c = word1.charAt(i);
            if(map1.containsKey(c)){
                map1.put(c, map1.get(c) + 1);
            }
            else{
                map1.put(c, 1);
            }
        }

         for(int i = 0; i < word2.length(); i++){
            char c = word2.charAt(i);
            if(map2.containsKey(c)){
                map2.put(c, map2.get(c) + 1);
            }
            else{
                map2.put(c, 1);
            }
        } 
        if(!map1.keySet().equals(map2.keySet())){  // Check if the keysets of both maps equal or not.
            return false;
        }
        HashMap<Integer, Integer> freq1 = new HashMap<>();  // To check the frequency of each character.
        HashMap<Integer, Integer> freq2 = new HashMap<>();

        for(int freq : map1.values()){
            freq1.put(freq, freq1.getOrDefault(freq, 0)+ 1);  // If the frequency of each character in both maps same or not.
        }
        for(int freq : map2.values()){
            freq2.put(freq, freq2.getOrDefault(freq, 0)+ 1);
        }

        return freq1.equals(freq2);
    }
}