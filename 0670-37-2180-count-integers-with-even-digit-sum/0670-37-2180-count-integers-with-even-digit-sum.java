class Solution {
    public int countEven(int num) {
        int count = 0;
        
        for (int i = 1; i <= num; i++) {
            int sum = 0, temp = i;
            
            while (temp > 0) {
                sum += temp % 10; // Extract last digit and add to sum
                temp /= 10;       // Remove last digit
            }
            
            if (sum % 2 == 0) { // Check if the sum of digits is even
                count++;
            }
        }
        
        return count;
    }
}
