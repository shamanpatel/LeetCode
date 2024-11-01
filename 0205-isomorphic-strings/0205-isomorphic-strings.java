class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false; // Check for different lengths

        HashMap<Character, Integer> str = new HashMap<>(); 
        HashMap<Character, Integer> isomorphic = new HashMap<>();

       
        for (int i = 0; i < s.length(); i++) {   // Store the frequency maps for both strings.
            if(!str.containsKey(s.charAt(i))){
                str.put(s.charAt(i),i);
            }
            if(!isomorphic.containsKey(t.charAt(i))){
                isomorphic.put(t.charAt(i),i);
            }
            if(!str.get(s.charAt(i)).equals(isomorphic.get(t.charAt(i)))){ // Check if the character equals to charcter map.
                return false;
            }
        }
        return true;
    }
}
