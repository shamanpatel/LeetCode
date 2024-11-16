class Solution {
    public int firstUniqChar(String s) {  // Used HashMap instead of queue.
        HashMap<Character, Integer> chr = new HashMap<>();
        for(char i : s.toCharArray()){ // Store the frequency of each chracter in string.
            chr.put(i, chr.getOrDefault(i, 0) + 1);
        }
        for(int i = 0; i <s.length(); i++){ // Run a for loop to check the iteration of character that equal to 1.
            if(chr.get(s.charAt(i)) == 1){ // If there is a character withh frequency 1.
                return i; // Return the index.
            }
        }
        return -1; // Else return -1.
        
    }
}