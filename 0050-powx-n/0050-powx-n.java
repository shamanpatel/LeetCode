class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 1){  // Use recusion stack.
            return x * myPow(x, n - 1);
        }
        if(n % 2 == 0){ // 
            return myPow(x *x, n / 2);
        }
        return 1 / myPow(x, -n); // if n is less than 0.
    }
}
