class Solution {
    public String clearDigits(String s) {
       Stack<Character> st = new Stack<>(); // Using stack to check the digit.
       for(char ch : s.toCharArray()){ // Push the charatcer into the stack if there is no digits.
        if(!Character.isDigit(ch)){
            st.push(ch);
        }else{
            st.pop(); // If there is a digit remove the peek character from the stack.
        }
       }
       StringBuilder sb = new StringBuilder(); 
       while(st.size() > 0){ // Return new String with remaining characters.
        sb.append(st.pop());
       }
       return sb.reverse().toString();
    }
}