class Solution {
    public char kthCharacter(int k) {
        int length = 1; // Initial length set to 1.
        int firstChar = 97; // The first character is 'a'.

        while(length < k){
            length *= 2; // Multiply length by 2 as every time length increase by 1 two characters are added to the string.
        }
        while(length > 1){ 
           length /= 2; // Divide the length
           if(k > length){ // If k is greater than the length reduce k 
            k -= length;
            firstChar++; // Increase the character ascii value.
           }
        }
        return (char) firstChar;
    }
}