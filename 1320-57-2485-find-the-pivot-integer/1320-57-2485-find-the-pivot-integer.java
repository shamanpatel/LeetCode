class Solution {
    public int pivotInteger(int n) {
        int s = (n * n + n) / 2;

        double x = Math.sqrt(s);
        if(x == (int)x){
            return (int) x;
        }
        return -1;
    }
}