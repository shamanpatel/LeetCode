class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i = 0; i < strs.length; i++){
            while(strs[i].indexOf(prefix)!= 0){ // Remove the character if it's not matching
                prefix = prefix.substring(0, prefix.length() - 1); // Update the prefix after deleting the character
            }
        }
        return prefix;
    }
}