class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);     
        roman.put('V', 5);    
        roman.put('X', 10);    
        roman.put('L', 50);    
        roman.put('C', 100);   
        roman.put('D', 500);   
        roman.put('M', 1000);  
        
        int ans = 0;

       
        for(int i = 0; i < s.length(); i++) {  // Loop through each character in the string s
            // Check if the current character has a smaller value than the next character.
            // This indicates a subtraction case (e.g., IV = 4 or IX = 9).
            if (i < s.length() - 1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                // Subtract the value of the current Roman numeral from `ans`
                ans -= roman.get(s.charAt(i));
            } 
            else {
                // Otherwise, add the value of the current Roman numeral to ans.
                ans += roman.get(s.charAt(i));
            }
        }
        
        return ans;
    }
}
