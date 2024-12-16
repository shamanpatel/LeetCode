class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); // Trim leading and trailing spaces
        String[] words = s.split(" "); // Split the string into words
        return words[words.length - 1].length(); // Access the last word and return its length
    }
}
