class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");  //  Split the string.
        if(word.length != pattern.length()){ // Now if the length is not matching return false
            return false;
        }
        HashMap<Character, String> map = new HashMap(); // Created a HashMap that match the character to a String 
    
        for(int i=0; i<pattern.length(); i++){ 
            char c = pattern.charAt(i); // Take a single character from the String

            if(map.containsKey(c)){  // If map contains that character 
                if(!map.get(c).equals(word[i])){ // Then if it not equals to the word in string s.
                    return false;
                }
            }
            else{
                if(map.containsValue(word[i])){ 
                    return false;
                }
                map.put(c, word[i]); // Then add the word to a character map.
            }
        }

        return true;
    }
}