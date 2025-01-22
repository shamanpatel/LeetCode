class Solution {
    public double trimMean(int[] arr) {
       Arrays.sort(arr);
       double med = (double)(arr.length * 5) / 100;
       double sum = 0;
       double n = arr.length - med * 2;

       for(int i = (int)med; i < arr.length - (int)med; i++){
        sum += arr[i];
       }
       return sum / n; 
    }
}