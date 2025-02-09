class Solution {
    public int prefixCount(String[] words, String pref) {
        int result = 0;
        for(String s : words){
            if(s.length() >= pref.length() && s.substring(0, pref.length()).equals(pref)){
                result++;
            }
        }
        return result;
    }
}