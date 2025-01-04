class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int temp = x;
        int digit = 0;
        while(x > 0){
            digit = (digit * 10) + (x % 10);
            x = x /10;
        }
        return temp == digit;
    }
}