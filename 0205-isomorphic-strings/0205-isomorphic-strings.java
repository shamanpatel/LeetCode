class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> isomorphic = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char charS = s.charAt(i); 
            char charT = t.charAt(i);

            if(map.containsKey(charS)){
                if(map.get(charS) != charT){ //If characters does not match return false
                    return false;
                }
            }
            else{
                if(isomorphic.containsKey(charT)){ //If characters does not match return false
                    return false;
                }
                map.put(charS, charT); // Add the character of map as key and character of isomorphic as value.
                isomorphic.put(charT, charS);// Add the character of isomorphic as key and character of map as value.
            }
        }
        return true;
    }
}