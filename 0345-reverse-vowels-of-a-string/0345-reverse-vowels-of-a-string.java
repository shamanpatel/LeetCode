class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>();  // Created a HashSet to store the vowels.
        StringBuffer string = new StringBuffer(s); // Used StrigBuffer class to create a new String.
        int i = 0; // The first pointer is at 0.
        int j = s.length() - 1; // The second pointer is at last index of string.

        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        while(i<j){
            if(set.contains(s.charAt(i)) && set.contains(s.charAt(j))){ // If Both i and j have vowels
               string.setCharAt(i, s.charAt(j)); // Set the character to the string 
               string.setCharAt(j, s.charAt(i));
               i++; // Iterrate the pointer i
               j--; // Decrease the pointer j
            }
            else if(set.contains(s.charAt(i)) && !set.contains(s.charAt(j))){ // If pointer j is not a vowel
                j--; // Move the pointer j
            }
            else if(!set.contains(s.charAt(i)) && set.contains(s.charAt(j))){ // If i is not a vowel
                i++; // Increment the i
            }
            else{
                i++; 
                j--;
            }
        }
        return string.toString();
    }
}