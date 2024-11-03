class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();  
        HashMap<Character, Character> map = new HashMap<>(); // To store the closing  bracket as key and opening as value

        map.put(')', '('); // Added all types of closing and opening brackets.
        map.put('}', '{');
        map.put(']', '[');

        for(char c : s.toCharArray()){ // Converted a string character to Array so that it can push to the Stack.
            if(map.containsValue(c)){ // If the value is in map, that is the opening bracket.
                stack.push(c);  // Add it to the stack.
            }
            else{
                if(stack.isEmpty() || map.get(c) != stack.pop()) {  // Now check if stack is empty or Check the stack’s top element
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}