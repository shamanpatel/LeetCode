class Solution {
    public int minTimeToType(String word) {
        int seconds = word.length();
        char prev = 'a';
        for(int i = 0; i < word.length(); i++){
            char current = word.charAt(i);
            int difference = Math.abs(current - prev);
            seconds += Math.min(difference, 26 - difference);
            prev = current;
        }
        return seconds;
    }
}