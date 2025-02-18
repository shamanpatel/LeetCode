class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i <= pattern.length(); i++) {
            temp.append((char) ('1' + i)); // Append the next number

            if (i == pattern.length() || pattern.charAt(i) == 'I') {
                ans.append(temp.reverse()); // Reverse and append when 'I' is found
                temp.setLength(0); // Clear the temporary stack
            }
        }
        
        return ans.toString();
    }
}
