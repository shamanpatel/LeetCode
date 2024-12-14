class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", ""); // Remove all the spaces and characters, commas from the string
        int i = 0;
        int j = s.length() - 1;
        while(i <= j){ 
            if(s.charAt(i) != s.charAt(j)){ /// If characters doesn't match return false
                return false;
            }
            i++; // Move the pointer i forward and j backwards.
            j--;
        }
        return true;
    }
}