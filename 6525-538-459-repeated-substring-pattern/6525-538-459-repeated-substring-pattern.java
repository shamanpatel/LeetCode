class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length(); // Calculate the length of the String.
        for(int i = len / 2; i >= 1; i--){ // Run a for loop from half length of the String.
            if(len % i == 0){ 
                int num_repeats = len / i; // We found the String and calculate how many times we need to check it.
                String substring = s.substring(0, i); // Created the substring.
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < num_repeats; j++){ // Now we add the substring to the new String for number of repetations we need to perfrom
                    sb.append(substring);
                }
                if(sb.toString().equals(s)){ // If the new string equals to the current input string we found the pattern.
                    return true;
                }
            }
        }
        return false;
    }
}