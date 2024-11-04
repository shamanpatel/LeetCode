class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) { // If two strings are not equal
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length()); // Find the GCD of the lengths of str1 and str2
        return str1.substring(0, gcdLength); // Return the prefix of str1 up to the GCD length
    }
    
    public static int gcd(int a, int b) { // Helper method to find the GCD of two numbers using the Euclidean algorithm
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}