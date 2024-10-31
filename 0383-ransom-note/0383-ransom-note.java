class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ransom = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);  // Convert the string in to a character.
    
            if (!ransom.containsKey(c)) {  
                ransom.put(c, 1);  // If the charcter is not present store it and put the frequency at 1.
            } 
            else {
                
                ransom.put(c, ransom.get(c) + 1);  // If the character is already present, increment its count by 1
            }
        }
       
        for (int i = 0; i < ransomNote.length(); i++) { // Check now the characters is present in ransomNote or not.
            char c = ransomNote.charAt(i);
           
            if (ransom.containsKey(c) && ransom.get(c) > 0) {  // If the character is present in the HashMap and its count is greater than 0,
                ransom.put(c, ransom.get(c) - 1);   // decrement its count by 1
            } 
            else {
                return false;
            }
        }
        return true;  // return true if the string can be constructed.
    }
}