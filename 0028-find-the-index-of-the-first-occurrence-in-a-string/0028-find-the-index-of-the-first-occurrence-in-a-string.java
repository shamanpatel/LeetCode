class Solution {
    public int strStr(String haystack, String needle) {
       int stack = haystack.length();
       int length = needle.length();

       if(stack < length){ // Case where there is no matching of strings
        return -1;
       }

       for(int i = 0; i <= stack - length; i++){ // RUn the for loop till the diff of both strings.
        if(haystack.charAt(i) == needle.charAt(0)){ // If the first character matched
            boolean found = true; // Set boolean true
            for(int j = 1; j < length; j++){ // Again check if second character is not matching
                if(haystack.charAt(i + j) != needle.charAt(j)){
                    found = false; //  return false 
                    break; // And break the code
                }
            }
            if(found){ // If found is true return the index of i.
                return i;
                }
        }
       }
       return -1;
    }
}