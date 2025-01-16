class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0; 

        while(i >= 0 || j >=0 || carry > 0){ // Iterate until any of three satisfy first.
            int sum = carry;
            if(i >= 0){
                sum += num1.charAt(i--) - '0'; // If the length is greater than 0, add the last digit to the sum
            }
            if(j >= 0){
                sum += num2.charAt(j--) - '0'; // Same for num2.
            }
            result.append(sum % 10); 
            carry = sum / 10;
        }
        return result.reverse().toString(); // Reverse the String.
    }
}