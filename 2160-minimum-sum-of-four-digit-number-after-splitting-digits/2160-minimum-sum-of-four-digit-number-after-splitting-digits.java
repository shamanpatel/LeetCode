class Solution {
    public int minimumSum(int num) {
        int[] digit = new int[4];
        int curr = 0;
        while(num > 0){
            digit[curr++] = num % 10;
            num /= 10;
        }
        Arrays.sort(digit);
        int num1 = digit[0] * 10 + digit[2];
        int num2 = digit[1] * 10 + digit[3];
        return num1 + num2;
    }
}