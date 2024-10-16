class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> count = new HashMap<>(); //Store the frequency of characters
        for (int i = 0; i < s.length(); i++) { // Iterate through String & add the count of each character
            char ch = s.charAt(i);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (count.containsKey(c)) { //Check if characters in t contains the key.
                if (count.get(c) == 1) { //If count of t and s matches, remove the character.
                    count.remove(c);
                } else {
                    count.put(c, count.get(c) - 1); // Else decrease the count of the character by one.
                }
            } else {
                return false;
            }
        }
        return count.isEmpty(); // Check is the String is empty or not.
    }
}