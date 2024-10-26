class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> number = new HashSet<>(); // Created a HashSet which use Integer wrapper class.
        while(!number.contains(n)){ // If the number is not in HashSet add it.
            number.add(n);
            n = Squares(n);  //Passing the value of n in Squares method.
            if(n == 1){   // If the value of n reaches to 1, then the number is happy.
                return true;
            }
        }
        return false;
    }

public int Squares(int n){
    int sum = 0;  //Initially the sum is 0.
    while(n > 0){ 
        int num = n % 10;  // To get remainder
        num = num * num;  // Square of the num
        sum += num;      // Add it to the sum
        n = n / 10;      // Getting the quotient, so we get new value of n.
    }
    return sum;         
   }
}